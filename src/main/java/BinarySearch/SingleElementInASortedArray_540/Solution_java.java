package BinarySearch.SingleElementInASortedArray_540;

public class Solution_java {

    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length;
        while(l < r){
            int m = l + (r -l) / 2;
            if(m % 2 == 1){
                --m;
            }
            if(nums[m] == nums[m + 1]){
                l = m + 2;
            }else{
                r = m;
            }
        }
        return nums[l];
    }
}
