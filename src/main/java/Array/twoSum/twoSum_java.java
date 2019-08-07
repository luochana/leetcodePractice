package Array.twoSum;

public class twoSum_java {
    public int[] two_Sum(int[] nums, int target) {
        int len=nums.length;
        int[] b=new int[2];
        for(int i=0;i<len;++i)
            for(int j=0;j<len;++j)
            {
                if (nums[i]+nums[j]==target)
                {
                    b[0]=i;
                    b[1]=j;
                    break;
                }
            }
        return b;
    }

    public static void main(String[] args) {
        int b[]={2,7,11,15};
        twoSum_java temp=new twoSum_java();
        int result[]=temp.two_Sum(b,9);
        for(int i=0;i<result.length;++i)
            System.out.println(result[i]);
    }
}
