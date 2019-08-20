package hot_100.FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray_java {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0;i < nums.length;)
        {
            int loc = nums[i];
            if(loc == -1 || i == loc-1)
            {
                i++;
                continue;
            }
            if(nums[loc-1] == loc)
            {
                nums[i] = -1;
                i++;
                continue;
            }
            int temp = nums[loc-1];
            nums[loc-1] = nums[i];
            nums[i] = temp;
        }
        List<Integer>ans = new ArrayList(nums.length);
        for(int i = 0;i < nums.length;i++)
            if(nums[i] == -1)
                ans.add(i+1);
        return ans;

    }
}
