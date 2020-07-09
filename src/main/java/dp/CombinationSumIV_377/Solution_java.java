package dp.CombinationSumIV_377;

public class Solution_java {
    public int combinationSum4(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1;
        //  Arrays.sort(nums);
        for(int i = 0; i <= target; ++i){
            for(int num : nums){
                if(i >= num)
                    dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }
}
