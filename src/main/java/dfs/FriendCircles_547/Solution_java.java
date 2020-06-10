package dfs.FriendCircles_547;

import java.util.HashSet;

public class Solution_java {
    public int findCircleNum(int[][] M) {
        int num = M.length;
        HashSet<Integer> visited = new HashSet<>();
        int res = 0;
        for(int i = 0; i < num; ++i){
            if(!visited.contains(i)){
                ++res;
                visited.add(i);
                for(int j = 0; j < num; ++j){
                    dfs(M, visited, i, j);
                }
            }
        }
        return res;
    }

    public void dfs(int[][] M, HashSet<Integer> visited, int i, int j){
        if(!visited.contains(j) && M[i][j] == 1){
            visited.add(j);
            for(int p = 0; p < M.length; ++p){
                dfs(M, visited, j, p);
            }
        }
    }
}
