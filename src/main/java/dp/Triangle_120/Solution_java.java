package dp.Triangle_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


//6%, dp
public class Solution_java {
    public int minimumTotal(List<List<Integer>> triangle) {
        LinkedList<Integer> dp = new LinkedList<>();
        dp.add(triangle.get(0).get(0));
        // triangle.removeFirst();
        for(List<Integer> list : triangle){
            if(list.size() == 1)
                continue;
            int size = list.size();
            for(int i = 0; i < size; ++i){
                if(i -1 < 0){
                    dp.add(list.get(i) + dp.get(0));
                }else if(i == size -1){
                    dp.add(list.get(i) + dp.get(i - 1));
                }else{
                    dp.add(Math.min(list.get(i) + dp.get(i), list.get(i) + dp.get(i -1)));
                }
            }

            for(int i = 0; i < size - 1; ++i){
                dp.remove(0);
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < dp.size(); ++i)
            res = Math.min(res, dp.get(i));

        return res;
    }

   //题解，自底向上dp
    public int minimumTotal1(List<List<Integer>> triangle) {
        //1. 初始化最后一层数据
        int m = triangle.size();
        List<Integer> list = triangle.get(m - 1);
        int n = list.size();
        int[] dp = new int[m];
        for (int j = 0; j < n; j++) {
            Integer integer = list.get(j);
            dp[j] = integer;
        }
        //2. start DP
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j] + triangle.get(i).get(j), dp[j + 1] + triangle.get(i).get(j));
            }
        }
        return dp[0];
    }


    public static void main(String[] args) {
        Solution_java aaa = new Solution_java();

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add( Arrays.asList(2));
        triangle.add( Arrays.asList(3,4));
        triangle.add( Arrays.asList(6,5,7));
        triangle.add( Arrays.asList(4,1,8,3));

        aaa.minimumTotal1(triangle);
    }

}
