package hot_100.MajorityElement;

//每次删除两个不一样的数,剩下的一定是众数. 因为题中众数超过一半
public class MajorityElement_java {
    public int majorityElement(int[] nums) {
        int length=nums.length;
        int slow=0,fast=0;
        int[] flag=new int[length];
        while (slow<length&&fast<length){
            if(nums[slow]==nums[fast])
                ++fast;
            else {
                if(flag[slow]==0&&flag[fast]==0) {
                    flag[slow] = 1;
                    flag[fast] = 1;
                    ++slow;
                    ++fast;
                }else if(flag[slow]==1)
                    ++slow;
            }
        }
        for(int i=0;i<length;++i) {
            if (flag[i] == 0)
                return nums[i];
        }
        return 0;
    }
}
