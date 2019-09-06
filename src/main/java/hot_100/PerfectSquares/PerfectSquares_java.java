package hot_100.PerfectSquares;
/*
    假设最小公式值m = ƒ(n) 那么n的值满足下列公式 ∑A[i] * A[i] = n 认为最大k的平方小于n k * k < n 则可以推出ƒ(n - k * k) + 1 = ƒ(n) +1的原因是<,额外需要一个
*/

public class PerfectSquares_java {
    public int numSquares(int n) {
        int[] dp = new int[n + 1]; // 默认初始化值都为0
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // 最坏的情况就是每次+1
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1); // 动态转移方程
            }
        }
        return dp[n];
    }
}
