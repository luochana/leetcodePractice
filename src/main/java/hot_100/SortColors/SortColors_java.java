package hot_100.SortColors;

public class SortColors_java {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int current=0;
        int temp;
        while (current<=right){
            if(nums[current]==0){
                temp=nums[left];
                nums[left++]=nums[current];
                nums[current++]=temp;
            }
            else if(nums[current]==2){
                temp=nums[current];
                nums[current]=nums[right];
                nums[right--]=temp;
            }else{
                current++;
            }
        }
    }
}
