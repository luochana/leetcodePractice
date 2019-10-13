package hot_100.MaximalRectangle

import java.util.Arrays

class MaximalRectangle_scala {
  def maximalRectangle(matrix: Array[Array[Char]]): Int = {
    if (matrix.length == 0) return 0
    val m = matrix.length
    val n = matrix(0).length
    val left = new Array[Int](n) // initialize left as the leftmost boundary possible
    val right = new Array[Int](n)
    val height = new Array[Int](n)
    Arrays.fill(right, n) // initialize right as the rightmost boundary possible

    var maxarea = 0
    for(i <- 0 until m) {
      var cur_left = 0
      var cur_right = n
      // update height
      for (j <- 0 until  n) {
        if (matrix(i)(j) == '1') {
          height(j) += 1; height(j) - 1
        }
        else height(j) = 0
      }
      // update left
      for (j <- 0 until  n) {
        if (matrix(i)(j) == '1') left(j) = Math.max(left(j), cur_left)
        else {
          left(j) = 0
          cur_left = j + 1
        }
      }
      // update right
      var j = n - 1
      for( j <- (0 to n-1).reverse) {
        if (matrix(i)(j) == '1') right(j) = Math.min(right(j), cur_right)
        else {
          right(j) = n
          cur_right = j
        }
      }
      // update area
      for (j <- 0 until  n) {
        maxarea = Math.max(maxarea, (right(j) - left(j)) * height(j))
      }
    }
    maxarea
  }
}
