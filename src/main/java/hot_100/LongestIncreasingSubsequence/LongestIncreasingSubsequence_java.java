package hot_100.LongestIncreasingSubsequence;

import java.util.*;

//O(n^2),步骤很粗糙
public class LongestIncreasingSubsequence_java {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return  0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],1);
        if(nums.length>=2) {
            for (int i = 1; i < nums.length; ++i) {
                if (!map.containsKey(nums[i]))
                    map.put(nums[i], 1);
                Set<Integer> temp = map.keySet();
                int maxnun = 0;
                for (int j : temp) {
                    if (nums[i] > j) {
                        if (maxnun < map.get(j))
                            maxnun = map.get(j);
                    }
                }
                map.put(nums[i], maxnun + 1);
            }
        }
        Collection<Integer> res=map.values();
        int max=-1000;
        for (int n:res)
            if(n>max)
                max=n;
        return max;
    }

    //记录一下别人的dp做法O(nlog(n))
    public int lengthOfLIS2(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }



    public static void main(String[] args) {
        LongestIncreasingSubsequence_java a=new LongestIncreasingSubsequence_java();
        System.out.println(a.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
