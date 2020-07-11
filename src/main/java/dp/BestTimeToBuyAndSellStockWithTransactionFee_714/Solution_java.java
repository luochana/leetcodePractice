package dp.BestTimeToBuyAndSellStockWithTransactionFee_714;

public class Solution_java {
    public int maxProfit(int[] prices, int fee) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int N = prices.length;
        int[] buy = new int[N];
        int[] sell = new int[N];
        int[] after_sell_none_operation = new int[N];
        int[] after_buy_none_operation = new int[N];
        buy[0] = -prices[0];
        after_buy_none_operation[0] = Integer.MIN_VALUE;
        for(int i = 1; i < N; ++i){
            buy[i] = Math.max(sell[i - 1], after_sell_none_operation[i -1]) - prices[i];
            sell[i] = Math.max(buy[i -1], after_buy_none_operation[i - 1]) + prices[i] - fee;
            after_buy_none_operation[i] = Math.max(buy[i - 1], after_buy_none_operation[i - 1]);
            after_sell_none_operation[i] = Math.max(after_sell_none_operation[i - 1], sell[i - 1]);
        }
        return Math.max(sell[N - 1], after_sell_none_operation[N - 1]);
    }
}
