package sort.IntersectionOfTwoArrays_349;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution_java {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; ++i)
            set.add(nums1[i]);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; ++i){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); ++i){
            res[i] = list.get(i);
        }
        return res;
    }
}
