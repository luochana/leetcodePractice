package hashTable.RepeatedDNASequences_187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_java {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length();
        Set<String> res = new HashSet<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= len - 10; i++) {
            String key = s.substring(i, i + 10);
            //之前是否存在
            if (set.contains(key)) {
                res.add(key);
            } else {
                set.add(key);
            }

        }
        return new ArrayList<>(res);
    }
}
