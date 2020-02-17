package hot_100.FindTheDuplicateNumber_287;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber_java {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}
