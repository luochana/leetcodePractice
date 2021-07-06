package array.CombinationSumII_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_java {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return lists;
        }
        //重要
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        process(0, candidates, target, list);
        return lists;
    }

    private void process(int start, int[] candidates, int target, List<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            lists.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                //因为这个数和上个数相同，所以从这个数开始的所以情况，在上个数里面都考虑过了，需要跳过
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }

                list.add(candidates[i]);
                process(i + 1, candidates, target - candidates[i], list);
                list.remove(list.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        Solution_java aaa = new Solution_java();
        System.out.println(aaa.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
