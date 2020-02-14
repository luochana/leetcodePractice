package hot_100.CountingBits_338;

public class CountingBits_java {
    public int[] countBits(int num)
    {
        int[] dp = new int[num+1];
        dp[0] = 0;
        if(num >= 1)
            dp[1] = 1;
        int flag = 1;
        for(int i = 2; i <= num; ++i)
        {
            if(i / flag == 2) {
                dp[i] = 1;
                flag *= 2;
            }
            else {
                dp[i] = dp[i - flag] + 1;
            }
        }
        return dp;
    }
}
