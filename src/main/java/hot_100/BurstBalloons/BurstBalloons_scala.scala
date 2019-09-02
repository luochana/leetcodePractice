package hot_100.BurstBalloons

class BurstBalloons_scala {
  def maxCoins(nums: Array[Int]): Int = {
    //dp[i][j]代表i->j的最大值
    val dp =  Array.ofDim[Int](nums.length+2,nums.length+2)
    //左右+1方便操作。 nums[-1] = nums[n] = 1
    val newNums = new Array[Int](nums.length + 2)

    for (i <- 1 until( newNums.length - 1)) {
      newNums(i) = nums(i - 1)
    }
    newNums(0) = 1
    newNums(newNums.length - 1) = 1
    //从2开始，保证最少3个
   // var j = 2
    for ( j <- 2 until ( newNums.length)) { //遍历所有的可能性，0-2...0-n,1-3...1-n,...
      for ( i <- 0 until( newNums.length - j)) {
        for (k <- (i + 1) until (i + j)) {
          dp(i)(i + j) = Math.max(dp(i)(i + j), dp(i)(k) + dp(k)(i + j) + newNums(i) * newNums(k) * newNums(i + j))
        }
      }
    }
    dp(0)(newNums.length - 1)
  }

}
