package hot_100.FindAllNumbersDisappearedinanArray

import java.util.ArrayList

class FindAllNumbersDisappearedinanArray_scala {
  def findDisappearedNumbers(nums: Array[Int]): ArrayList[Int] = {
    var i = 0
    while ( i < nums.length) {
      val loc = nums(i)
      if (loc == -1 || i == loc - 1) {
        i += 1
      }
      else if (nums(loc - 1) == loc) {
        nums(i) = -1
        i += 1
      }
      else {
        val temp = nums(loc - 1)
        nums(loc - 1) = nums(i)
        nums(i) = temp
      }
    }
    val ans = new ArrayList[Int]()


    for(j <-0 until(nums.length)){
      if (nums(j) == -1)
        ans.add(j+1)

    }
    ans
  }
}
