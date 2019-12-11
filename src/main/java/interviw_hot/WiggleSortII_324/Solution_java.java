package interviw_hot.WiggleSortII_324;

import java.util.Arrays;

public class Solution_java {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int  left = nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2 + 1;
        int right = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                res[i] = nums[left - 1];
                --left;
            }else{
                res[i] = nums[right];
                --right;
            }
        }
        System.arraycopy(res,0,nums,0,nums.length);
    }
}
