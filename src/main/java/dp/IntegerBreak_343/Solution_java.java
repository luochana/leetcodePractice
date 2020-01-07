package dp.IntegerBreak_343;

public class Solution_java {

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= n; ++i){
            int temp = Integer.MIN_VALUE;
            for(int j = 1; j < i; ++j){
                int n1 = dp[j] * dp[i - j];
                int n2 = j * (i - j);
                int n3 = dp[j] * (i - j);
                int n4 = dp[i - j] * j;
                temp = Math.max(temp, Math.max(n1, Math.max(n2,Math.max(n3, n4))));
            }
            dp[i] = temp;
        }
        return dp[n];
    }
}
