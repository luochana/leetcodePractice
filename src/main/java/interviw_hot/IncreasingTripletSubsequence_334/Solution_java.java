package interviw_hot.IncreasingTripletSubsequence_334;

//https://leetcode-cn.com/problems/increasing-triplet-subsequence/solution/fang-fa-yi-dong-tai-gui-hua-by-user_jun/


public class Solution_java {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3)
            return false;
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= min){
                min = num;
            }
            else if(num <= mid){
                mid = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
