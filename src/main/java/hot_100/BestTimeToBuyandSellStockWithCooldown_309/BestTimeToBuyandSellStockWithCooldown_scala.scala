package hot_100.BestTimeToBuyandSellStockWithCooldown_309

class BestTimeToBuyandSellStockWithCooldown_scala {
  def maxProfit(prices: Array[Int]): Int = {
    if (prices.length == 0) return 0
    //dp1[i]表示第i天手上有股票的最大收益（前i天的最后一个状态是买入）
    val dp1 = new Array[Int](prices.length)
    //dp2[i]表示第i天卖出股票的最大收益
    val dp2 = new Array[Int](prices.length)
    //dp3[i]表示前i天最后一个状态为冷冻期的最大收益（第i天要么无状态即冷冻期后没有再买入，要么为冻结状态）
    val dp3 = new Array[Int](prices.length)
    dp1(0) = 0 - prices(0)
    for( i <- 1 until ( prices.length)) {
      //第i天买入股票：dp3[i - 1] - prices[i]（dp3[i - 1]表明今天可以买）
      //第i天不买入股票：dp1[i - 1]
      dp1(i) = Math.max(dp3(i - 1) - prices(i), dp1(i - 1))
      //第i天卖出股票
      dp2(i) = dp1(i - 1) + prices(i)
      //第i天为冷冻期：代表第i-1天卖出股票->dp2[i - 1]
      //第i天为无状态：dp3[i- 1]
      dp3(i) = Math.max(dp2(i - 1), dp3(i - 1))
    }
    //1.最后一天卖出
    //2.最后一天为冷冻期
    //3.最后一天无状态（冷冻期后没有再买入）
    Math.max(dp2(prices.length - 1), dp3(prices.length - 1))
  }

}
