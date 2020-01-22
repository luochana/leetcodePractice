package array.RemoveDuplicatesFromSortedArrayII_80;

public class Solution_java {
    public int removeDuplicates(int[] nums) {
        int dupCount = 0;
        int p = 1;
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] == nums[i -1]){
                ++dupCount;
            }

            if(nums[i] != nums[i - 1]){
                dupCount = 0;
            }
            if(dupCount >= 2){
                continue;
            }

            nums[p++] = nums[i];
        }
        return p;
    }
}
