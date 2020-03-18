package hot_100.JumpGame_55

class JumpGame_scala {
  // dp
  def canJump(nums: Array[Int]): Boolean = {
    if (nums.length == 0 || nums.length == 1) return true
    val dp = new Array[Int](nums.length)
    dp(0) = nums(0)
    for (i <- 1 until  nums.length - 1) {
      if (dp(i - 1) < 1)
        return false
      dp(i) = Math.max(dp(i - 1) - 1, nums(i))

    }
    dp(nums.length - 2) >= 1
  }
}
