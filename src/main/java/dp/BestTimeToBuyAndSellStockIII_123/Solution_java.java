package dp.BestTimeToBuyAndSellStockIII_123;

public class Solution_java {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int N = prices.length;
        //0-3分别代表买入一次，卖出一次，买入两次，卖出两次
        int[][] dp = new int[4][N];
        dp[0][0] = -prices[0];
        dp[1][0] = 0;
        //第二次买入，利润有可能小于零，所以不能初始化为0
        dp[2][0] = -prices[0];
        dp[3][0] = 0;
        for(int i = 1; i < N; ++i){
            dp[0][i] = Math.max(dp[0][i - 1], -prices[i]);
            dp[1][i] = Math.max(dp[1][i - 1], prices[i] + dp[0][i - 1]);
            dp[2][i] = Math.max(dp[2][i - 1], dp[1][i - 1] - prices[i]);
            dp[3][i] = Math.max(dp[3][i - 1], dp[2][i - 1] + prices[i]);
        }
        return dp[3][N - 1];
    }
}
