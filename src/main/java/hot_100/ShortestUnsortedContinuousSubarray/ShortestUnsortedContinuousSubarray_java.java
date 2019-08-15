package hot_100.ShortestUnsortedContinuousSubarray;

public class ShortestUnsortedContinuousSubarray_java {
    public int findUnsortedSubarray(int[] nums) {

        int j=0;
        if(nums.length==1)
            return 0;
        while(j<nums.length-2&&nums[j]<=nums[j+1])
            j++;
        int min=j+1;
        int max=j;
        int flag=j;
        for(int i=j;i<nums.length;++i)
        {
            if(nums[max]<=nums[i])
                max=i;
            else {
                flag = i;
                if(nums[i]<nums[min])
                    min=i;
            }
        }
        while(j>=0&&nums[min]<nums[j])
            j--;
        return flag-j;
    }

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray_java a=new ShortestUnsortedContinuousSubarray_java();
        System.out.println(a.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, }));
    }
}
