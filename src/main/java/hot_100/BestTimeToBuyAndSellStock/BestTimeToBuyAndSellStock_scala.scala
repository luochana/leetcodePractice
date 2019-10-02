package hot_100.BestTimeToBuyAndSellStock

class BestTimeToBuyAndSellStock_scala {
  def maxProfit(prices: Array[Int]): Int = {
    if (prices.length == 0)
      return 0
    var res = 0
    var min = prices(0)
    var i = 1
    for(i <- 1 until(prices.length)) {
      res = Math.max(res, prices(i) - min)
      min = Math.min(min, prices(i))
    }
    res
  }
}