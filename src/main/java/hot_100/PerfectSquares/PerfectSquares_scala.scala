package hot_100.PerfectSquares

class PerfectSquares_scala {
  def numSquares(n: Int): Int = {
    val dp = new Array[Int](n + 1) // 默认初始化值都为0

    for (i <- 1 to n ) {
      dp(i) = i // 最坏的情况就是每次+1
      var j = 1
      while ( i - j * j >= 0) {
        dp(i) = Math.min(dp(i), dp(i - j * j) + 1) // 动态转移方程
        j+=1
      }
    }
    dp(n)
  }
}
