package bitManipulation.SingleNumberII_137;

public class Solution_java {
    //https://leetcode-cn.com/problems/single-number-ii/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by--31/
    // 解法三
    public int singleNumber(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i = 0; i < 32; ++i){
            for(int j = 0; j < nums.length; ++j){
                if((nums[j] >> i & 1) == 1)
                    ++count;
            }
            if(count % 3 != 0){
                res = res | 1 << i;
            }
            count = 0;
        }
        return res;
    }
}
