package bitManipulation.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets_java {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;++i)
        {
            List<List<Integer>> res1=new ArrayList<>();

            for(List<Integer> n:res)
                res1.add(new ArrayList<Integer>(n));
            for(List<Integer> x : res1)
            {
                x.add(nums[i]);
                res.add(x);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Subsets_java a=new Subsets_java();
        System.out.println(a.subsets(new int[]{1,2,3}).toString());
    }
}
