package greed.WiggleSubsequence_376;

public class Solution_java {

    //自己写得dp，有一个较长的测试不通过，找不出原因了
    public int wiggleMaxLength(int[] nums) {
        int[] dp = new int[nums.length];
        int[] flag = new int[nums.length];
        dp[0] = 1;
        flag[0] = 1;
        for(int i = 1; i < nums.length; ++i){
            for(int j = 0; j < i; ++j){
                int temp = 0;
                if((flag[j] == 1 && nums[i] - nums[j] > 0) || (flag[j] == 0 && nums[i] - nums[j] < 0)){
                    if(temp < dp[j] + 1)
                    {
                        dp[i] = dp[j] + 1;
                        flag[i] = nums[i] - nums[j] > 0 ? 0 : 1;
                        temp = dp[j] + 1;
                    }
                }
            }
        }
        return dp[nums.length - 1];
    }


    //官方题解
    public int wiggleMaxLength1(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    up[i] = Math.max(up[i],down[j] + 1);
                } else if (nums[i] < nums[j]) {
                    down[i] = Math.max(down[i],up[j] + 1);
                }
            }
        }
        return 1 + Math.max(down[nums.length - 1], up[nums.length - 1]);
    }


    //线性dp
    public int wiggleMaxLength2(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        up[0] = down[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up[i] = down[i - 1] + 1;
                down[i] = down[i - 1];
            } else if (nums[i] < nums[i - 1]) {
                down[i] = up[i - 1] + 1;
                up[i] = up[i - 1];
            } else {
                down[i] = down[i - 1];
                up[i] = up[i - 1];
            }
        }
        return Math.max(down[nums.length - 1], up[nums.length - 1]);
    }


    public static void main(String[] args) {
        Solution_java aaa = new Solution_java();
        aaa.wiggleMaxLength(new int[]{1,7,4,9,2,5});
    }
}
