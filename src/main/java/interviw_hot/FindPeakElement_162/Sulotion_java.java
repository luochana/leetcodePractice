package interviw_hot.FindPeakElement_162;

import java.util.ArrayList;

public class Sulotion_java {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
            return 0;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid - 1 >= 0 && mid + 1 < nums.length && nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
                return mid;
            if(mid == 0 && nums[mid] > nums[mid+1])
                return mid;
            if(mid == nums.length - 1 && nums[mid] > nums[mid - 1])
                return mid;
            if(nums[left] > nums[mid]){
                right = mid - 1;
            }else if(nums[right] > nums[mid]){
                left = mid + 1;
            }else{
                left = left + 1;
            }
        }
        return 0;
    }
}
