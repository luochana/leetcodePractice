package dp.HouseRobberII_213;

public class Solution_java {
    public int rob(int[] nums) {

        //判断几种比较特殊的条件
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0], nums[1]);

        //dp1[i]表示打劫第i家的最大收益
        int[] dp1 = new int[nums.length];
        //dp2[i]表示不打劫第i家的最大收益
        int[] dp2 = new int[nums.length];

        //不打劫最后一家
        dp1[0] = nums[0];
        dp2[0] = 0;
        for(int i = 1; i < nums.length; ++i){
            dp1[i] = dp2[i - 1] + nums[i];
            dp2[i] = Math.max(dp1[i - 1], dp2[i - 1]);
        }
        int res1 = dp2[nums.length - 1];

        //不打劫第一家
        dp1[0] = 0;
        dp2[0] = 0;
        dp1[1] = dp1[0] + nums[1];
        dp2[1] = dp2[0];

        for(int i = 2; i < nums.length; ++i){
            dp1[i] = dp2[i - 1] + nums[i];
            dp2[i] = Math.max(dp1[i - 1], dp2[i - 1]);
        }
        int res2 = Math.max(dp1[nums.length - 1], dp2[nums.length - 1]);
        return Math.max(res1,res2);
    }
}
