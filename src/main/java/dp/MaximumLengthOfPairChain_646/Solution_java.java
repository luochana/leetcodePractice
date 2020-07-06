package dp.MaximumLengthOfPairChain_646;

import java.util.Arrays;

public class Solution_java {
    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) {
            return 0;
        }
        Arrays.sort(pairs,(a, b) -> a[0] - b[0]);
        int[] dp = new int[pairs.length];
        for(int i = 0; i < pairs.length; ++i){
            int max = 1;
            for(int j = 0; j < i; ++j){
                if(pairs[i][0] > pairs[j][1])
                    max = Math.max(max, dp[j] + 1);
            }
            dp[i] = max;
        }
        int res = 1;
        for(int p : dp){
            res = Math.max(res, p);
        }
        return res;
    }
}
