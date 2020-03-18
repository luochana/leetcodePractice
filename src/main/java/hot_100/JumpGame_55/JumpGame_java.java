package hot_100.JumpGame_55;

public class JumpGame_java {
    public boolean canJump(int[] nums) {
        if(nums.length==0||nums.length==1)
            return true;
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        for (int i = 1; i < nums.length-1; i++) {
            if(dp[i-1]<1)
                return false;
            dp[i]=Math.max(dp[i-1]-1,nums[i]);
        }
        return dp[nums.length-1]>=1;
    }
}
