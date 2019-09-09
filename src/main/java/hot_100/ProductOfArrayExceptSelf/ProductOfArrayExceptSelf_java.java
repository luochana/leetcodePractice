package hot_100.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf_java {
    public int[] productExceptSelf(int[] nums) {
        int length=nums.length;
        if(length==0)
            return new int[0];
        if(length==1)
            return nums;
        int[] output=new int[length];
        output[length-1]=nums[length-1];
        for(int i=length-2;i>=0;--i)
        {
            output[i]=output[i+1]*nums[i];
        }
        int temp=1;
        for(int i=0;i<length-1;++i)
        {
            output[i]=temp*output[i+1];
            temp=temp*nums[i];
        }
        output[length-1]=temp;
        return output;
    }
}
