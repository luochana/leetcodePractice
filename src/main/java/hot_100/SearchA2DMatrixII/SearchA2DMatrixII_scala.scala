package hot_100.SearchA2DMatrixII

import java.util
import java.util.{ArrayList, List}

class SearchA2DMatrixII_scala {

  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    val rowNum = matrix.length
    if (rowNum == 0)
      return false
    val colNum = matrix(0).length
    if (colNum == 0)
      return false
    val row = new util.ArrayList[Integer]
    for (i <- 0 until (rowNum)) {
      if (matrix(i)(0) == target || matrix(i)(colNum - 1) == target)
        return true
      else if (matrix(i)(0) <= target && matrix(i)(colNum - 1) >= target)
        row.add(i)
    }
    var i = 0
    for(i <- 0 until (row.toArray.length)) {
      if (binarySearch(matrix(row.get(i)), target))
        return true
    }
    false
  }

  def binarySearch(arr: Array[Int], target: Int): Boolean = {
    var head = 0
    var tail = arr.length - 1
    while ( head <= tail) {
      val middle = (head + tail) / 2
      if (arr(middle) == target) return true
      else if (arr(middle) > target) tail = middle - 1
      else head = middle + 1
    }
    false
  }
}
