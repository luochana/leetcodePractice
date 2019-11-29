package interviw_hot.FourSumII_454;

import java.util.HashMap;

public class FourSumII_java {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                map.put(a + b,map.getOrDefault(a + b,0) + 1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                if(map.containsKey(0 - c - d )){
                    res += map.get(0 -c -d);
                }
            }
        }
        return res;
    }
}
