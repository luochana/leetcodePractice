package hot_100.CoinChange_322

import java.util.Arrays

class CoinChange_scala {
  def coinChange(coins: Array[Int], amount: Int): Int = {
    val max = amount + 1
    val dp = new Array[Int](amount + 1)
    Arrays.fill(dp, max)
    dp(0) = 0
    for ( i <- 1 to amount) {
      for (j <- 0 until  coins.length) {
        if (coins(j) <= i)
          dp(i) = Math.min(dp(i), dp(i - coins(j)) + 1)
      }
    }
    if (dp(amount) > amount) -1
    else dp(amount)
  }
}
