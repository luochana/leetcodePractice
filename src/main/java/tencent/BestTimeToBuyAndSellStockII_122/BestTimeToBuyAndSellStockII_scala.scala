package tencent.BestTimeToBuyAndSellStockII_122

class BestTimeToBuyAndSellStockII_scala {
  def maxProfit(prices: Array[Int]): Int = {
    var maxprofit = 0
    for (i <- 0 until  prices.length) {
      if (prices(i) > prices(i - 1)) maxprofit += prices(i) - prices(i - 1)
    }
    maxprofit
  }
}
