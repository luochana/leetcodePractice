package swordOffer.duplicateNum_03;

public class Solution_java {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(i == nums[i]){
                ++i;
            }else{
                int temp = nums[i];
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Solution_java test = new Solution_java();
        int[] nums = {2,3,1,0,2,5,3};
        System.out.println(test.findRepeatNumber(nums));
    }
}
