package heap.FindKPairWithSmallestSums_373;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


//https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/solution/cha-zhao-he-zui-xiao-de-kdui-shu-zi-by-lenn123/

public class Solution_java {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length, n2 = nums2.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> (nums1[o1[0]]+nums2[o1[1]]) - (nums1[o2[0]]+nums2[o2[1]]));
        List<List<Integer>> result = new ArrayList<>();

        if (n1 == 0 || n2 == 0 || k == 0)
            return result;
        for (int i = 0; i < n1; i++)
            pq.add(new int[]{i, 0});

        while(pq.size() > 0 && k > 0) {
            int[] pair = pq.poll();
            if (pair[1] + 1 < n2)
                pq.add(new int[]{pair[0], pair[1]+1});
            List<Integer> temp = new ArrayList<>();
            temp.add(nums1[pair[0]]);
            temp.add(nums2[pair[1]]);
            result.add(temp);
            k--;
        }

        return result;
    }

}
