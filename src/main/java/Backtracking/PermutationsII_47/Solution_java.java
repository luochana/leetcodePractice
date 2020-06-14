package Backtracking.PermutationsII_47;

import java.util.*;

public class Solution_java {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempNums = new ArrayList<>();
        for(int i : nums)
            tempNums.add(i);
        backtrack(nums.length, res, tempNums, 0);
        return res;
    }

    public void backtrack(int n, List<List<Integer>> res, List<Integer> nums, int first){
        if(n == first){
            res.add(new ArrayList<>(nums));
        }
        Set<Integer> set = new HashSet<>();
        for(int i = first; i < n; ++i){
            if((i == first || nums.get(i) != nums.get(first)) && !set.contains(nums.get(i)) ){
                set.add(nums.get(i));
                Collections.swap(nums, first, i);
                backtrack(n, res, nums, first + 1);
                Collections.swap(nums, first, i);
            }
        }
    }
}
