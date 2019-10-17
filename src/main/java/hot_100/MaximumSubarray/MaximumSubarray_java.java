package hot_100.MaximumSubarray;

public class MaximumSubarray_java {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int res=Integer.MIN_VALUE;
        int tempMAx=0;
        for (int i = 0; i < nums.length; i++) {
            tempMAx+=nums[i];
            if(tempMAx<=0) {
                res=Math.max(res,nums[i]);
                tempMAx = 0;
            }else {
                res = Math.max(res, tempMAx);
            }
        }
        return res;
    }
}
