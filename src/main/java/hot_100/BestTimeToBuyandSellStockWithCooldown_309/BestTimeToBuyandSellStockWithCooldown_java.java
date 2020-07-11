package hot_100.BestTimeToBuyandSellStockWithCooldown_309;

public class BestTimeToBuyandSellStockWithCooldown_java {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        //dp1[i]表示第i天手上有股票的最大收益（前i天的最后一个状态是买入）
        int[] dp1 = new int[prices.length];
        //dp2[i]表示第i天卖出股票的最大收益
        int[] dp2 = new int[prices.length];
        //dp3[i]表示前i天最后一个状态为冷冻期的最大收益（第i天要么无状态即冷冻期后没有再买入，要么为冻结状态）
        int[] dp3 = new int[prices.length];

        dp1[0] = 0 - prices[0];
        for(int i = 1; i < prices.length; i++) {
            //第i天买入股票：dp3[i - 1] - prices[i]（dp3[i - 1]表明今天可以买）
            //第i天不买入股票：dp1[i - 1]
            dp1[i] = Math.max(dp3[i - 1] - prices[i], dp1[i - 1]);
            //第i天卖出股票
            dp2[i] = dp1[i - 1] + prices[i];
            //第i天为冷冻期：代表第i-1天卖出股票->dp2[i - 1]
            //第i天为无状态：dp3[i- 1]
            dp3[i] = Math.max(dp2[i - 1], dp3[i - 1]);
        }
        //1.最后一天卖出
        //2.最后一天为冷冻期
        //3.最后一天无状态（冷冻期后没有再买入）
        return Math.max(dp2[prices.length - 1], dp3[prices.length - 1]);
    }


   //方法二，开四个数组，比较好理解
    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int N = prices.length;
        //第i天卖出
        int[] sell = new int[N];
        //第i天买入
        int[] buy = new int[N];
        //第i天是买入或者是卖出后无操作
        int[] after_sell_none_operation = new int[N];
        int[] after_buy_none_operation = new int[N];
        buy[0] = -prices[0];
        after_buy_none_operation[0] = Integer.MIN_VALUE;
        for(int i = 1; i < N; ++i){
            buy[i] = after_sell_none_operation[i - 1] -prices[i];
            sell[i] = Math.max(buy[i - 1] + prices[i], after_buy_none_operation[i -1] + prices[i]);
            after_buy_none_operation[i] = Math.max(buy[i -1], after_buy_none_operation[i - 1]);
            after_sell_none_operation[i] = Math.max(sell[i -1], after_sell_none_operation[i - 1]);
        }
        return Math.max(sell[N - 1], after_sell_none_operation[N - 1]);
    }
}
