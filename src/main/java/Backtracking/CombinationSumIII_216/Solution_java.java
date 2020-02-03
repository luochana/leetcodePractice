package Backtracking.CombinationSumIII_216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_java {
    int n;
    int k;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        this.n = n;
        this.k = k;
        process(new LinkedList<Integer>(), 1, 0);
        return res;
    }
    public void process(LinkedList<Integer> list, int start, int sum){
        if(list.size() == k && sum == n){
            res.add(new ArrayList<Integer>(list));
        }
        if(list.size() < k){
            for(int i = start; i <= 9; ++i){
                list.add(i);
                process(list, i + 1, sum + i);
                list.removeLast();
            }
        }
    }
}
