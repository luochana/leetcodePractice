package hot_100.FindNumInSortedArr_34;

public class FindNumInSortedArr_java {

/*    int[] res=new int[2];
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            res[0]=-1;
            res[1]=-1;
        }else {
            BinarySearch(0, nums.length, nums, target);
        }
        return res;
    }

    public void BinarySearch(int left,int right,int[] nums,int target){
        int mid=(left+right)/2;
        if(left>=right){
            res[0]=-1;
            res[1]=-1;
        }
        if(nums[mid]==target){
            int min=mid;
            while (min>=0&&nums[min]==target)
                min--;
            res[0]=++min;
            while (mid<nums.length&&nums[mid]==target)
                mid++;
            res[1]=--mid;
            return;

        }else if(mid<nums.length&&nums[mid]<target){
            BinarySearch(mid+1,right,nums,target);
        }else if(mid>0&&nums[mid]>target) {
            BinarySearch(left,mid-1,nums,target);
        }
    }*/

    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            }
            else {
                lo = mid+1;
            }
        }

        return lo;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        int leftIdx = extremeInsertionIndex(nums, target, true);

        // assert that `leftIdx` is within the array bounds and that `target`
        // is actually in `nums`.
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }

        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

        return targetRange;
    }
}

