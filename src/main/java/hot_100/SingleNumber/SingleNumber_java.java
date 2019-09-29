package hot_100.SingleNumber;

/*
方法 4：位操作
概念

如果我们对 0 和二进制位做 XOR 运算，得到的仍然是这个二进制位
a XOR 0= a
如果我们对相同的二进制位做 XOR 运算，返回的结果是 0
a XOR a= 0

XOR 满足交换律和结合律
a XOR b XOR a = (a XOR a) XOR b = 0 XOR b =b
所以我们只需要将所有的数进行 XOR 操作，得到那个唯一的数字。

*/

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_java {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }

    //hashmap,空间O(n)
    
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1; // can't find it.
    }

}
