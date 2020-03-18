package hot_100.HouseRobber_198

class HouseRobber_scala {
  def rob(nums: Array[Int]): Int = {
    val length = nums.length
    if (length == 0) return 0
    if (length == 1) return nums(0)
    val dp = new Array[Int](length)
    if (length >= 2) {
      for(i <- 0 until(length))
        dp(i) = nums(i)
      dp(1) = Math.max(dp(0), dp(1))
      for(i <- 2 until(length)) {
        dp(i) = Math.max(dp(i - 2) + nums(i), dp(i - 1))
      }
    }
    dp(length - 1)
  }
}
