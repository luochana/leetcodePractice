package interviw_hot.TwoCityScheduling_1029;

import java.util.Arrays;

//https://leetcode-cn.com/problems/two-city-scheduling/solution/er-cha-shu-de-chui-xu-bian-li-by-leetcode/

public class TwoCityScheduling_java {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a, b) -> (a[0] -a[1]) - (b[0] - b[1]));
        int mid = costs.length / 2;
        int res = 0;
        for(int i = 0; i < mid; ++i){
            res += costs[i][0] + costs[i + mid][1];
        }
        return res;
    }
}
