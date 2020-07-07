package dp.Coin_Change_2_518;

public class Solution_java {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int coin : coins){
            for(int i = coin; i <= amount; ++i){
                dp[i] = dp[i] + dp[i -coin];
            }
        }
        return dp[amount];
    }
}
