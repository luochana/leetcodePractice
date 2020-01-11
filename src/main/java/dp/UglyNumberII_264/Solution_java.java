package dp.UglyNumberII_264;

public class Solution_java {
    //https://leetcode-cn.com/problems/ugly-number-ii/solution/javati-jie-dong-tai-gui-hua-san-zhi-zhen-by-pphdsn/

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if (min == dp[i2] * 2) i2++;
            if (min == dp[i3] * 3) i3++;
            if (min == dp[i5] * 5) i5++;
            dp[i] = min;
        }

        return dp[n - 1];
    }
}
