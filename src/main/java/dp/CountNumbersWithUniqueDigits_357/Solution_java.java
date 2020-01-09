package dp.CountNumbersWithUniqueDigits_357;

public class Solution_java {
    
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 1;
        int[][] dp = new int[n][10];
        for(int i = 0; i < 10; ++i)
            dp[0][i] = 1;
        int res = 10;
        for(int i = 1; i < n; ++i){
            for(int j = 1; j < 10; ++j){
                dp[i][j] = dp[i - 1][j]  * (10 - i);
                res += dp[i][j];
            }
        }
        return res;
    }
}
