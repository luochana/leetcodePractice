package greed.MinimumNumberOfArrowsToBurstBalloons_452;

import java.util.Arrays;

public class Solution_java {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (o1, o2) -> o1[1] - o2[1]);
        int end = points[0][1], cnt = 1;
        for(int i = 0; i < points.length; ++i){
            if(points[i][0] <= end)
                continue;
            cnt++;
            end = points[i][1];
        }
        return cnt;
    }
}
