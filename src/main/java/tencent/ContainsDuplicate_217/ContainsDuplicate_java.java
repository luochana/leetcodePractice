package tencent.ContainsDuplicate_217;

import java.util.HashSet;

public class ContainsDuplicate_java {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(integers.contains(nums[i]))
                return true;
            else {
                integers.add(nums[i]);
            }
        }
        return false;
    }

}
