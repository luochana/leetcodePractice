package array.FourSum_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_java {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; ++i){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < nums.length - 2; ++j){
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int L = j + 1;
                int R = nums.length - 1;
                while(L < R){
                    int sum = nums[i] +nums[j] + nums[L] + nums[R];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[L],nums[R]));
                        while (L<R && nums[L] == nums[L+1]) L++; // 去重
                        while (L<R && nums[R] == nums[R-1]) R--; // 去重
                        L++;
                        R--;
                    }
                    else if (sum < target || L == j) L++;
                    else if (sum > target || R == j) R--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_java aa = new Solution_java();
        aa.fourSum(new int[]{0,0,0,0},0);
    }
}
