package hot_100.HouseRobber_198;

//dp.0ms.java提交击败100%
public class HouseRobber_java {
    public int rob(int[] nums) {
        int length=nums.length;
        if(length==0)
            return 0;
        if(length==1)
            return nums[0];

        int[] dp=new int[length];
        if(length>=2) {
            for (int i = 0; i < length; ++i)
                dp[i] = nums[i];
            dp[1] = Math.max(dp[0], dp[1]);
            for (int i = 2; i < length; ++i) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
        }
        return dp[length-1];
    }
}
