package dp.two_Keys_Keyboard_650;

public class Solution_java {
    public int minSteps(int n) {
        if(n == 1)
            return 0;
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; ++i){
            dp[i] = i;
        }
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j * i <= n; j++){
                dp[i * j] = Math.min(dp[i] + j, dp[i * j]);
            }
        }
        return dp[n];
    }
}
