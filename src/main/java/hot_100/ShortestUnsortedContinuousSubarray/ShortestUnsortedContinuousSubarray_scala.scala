package hot_100.ShortestUnsortedContinuousSubarray

class ShortestUnsortedContinuousSubarray_scala {
  def findUnsortedSubarray(nums: Array[Int]): Int = {
    var j = 0
    if (nums.length == 1) return 0
    while (j < nums.length - 2 && nums(j) <= nums(j + 1)) {
      j += 1
    }
    var min = j + 1
    var max = j
    var flag = j
    var i = j
    while ( i < nums.length) {
      if (nums(max) <= nums(i))
        max = i
      else {
        flag = i
        if (nums(i) < nums(min))
          min = i
      }
      i+=1
    }
    while ( j >= 0 && nums(min) < nums(j)) {
      j-=1
    }
    flag - j
  }
}
