package hot_100.MaximumProductSubarray

class MaximumProductSubarray_scala {
  def maxProduct(nums: Array[Int]): Int = {
    var max = Integer.MIN_VALUE
    var imax = 1
    var imin = 1
    for (i <- 0 until(nums.length)) {
      if (nums(i) < 0) {
        val tmp = imax
        imax = imin
        imin = tmp
      }
      imax = Math.max(imax * nums(i), nums(i))
      imin = Math.min(imin * nums(i), nums(i))
      max = Math.max(max, imax)

    }
    max
  }
}
