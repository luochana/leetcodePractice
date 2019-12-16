package interviw_hot.IntersectionOfTwoArraysII_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_java {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1) {
            if(!map.containsKey(num)) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }
        for(int num : nums2) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) - 1);
                if(map.get(num) == 0)
                    map.remove(num);
                list.add(num);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
