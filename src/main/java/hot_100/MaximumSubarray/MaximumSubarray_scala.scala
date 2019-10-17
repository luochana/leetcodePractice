package hot_100.MaximumSubarray

class MaximumSubarray_scala {
  def maxSubArray(nums: Array[Int]): Int = {
    if (nums.length == 0) return 0
    var res = Integer.MIN_VALUE
    var tempMAx = 0
    for (i <- 0 until nums.length) {
      tempMAx += nums(i)
      if (tempMAx <= 0) {
        res = Math.max(res, nums(i))
        tempMAx = 0
      }
      else {
        res = Math.max(res, tempMAx)
      }
    }
    res
  }
}
