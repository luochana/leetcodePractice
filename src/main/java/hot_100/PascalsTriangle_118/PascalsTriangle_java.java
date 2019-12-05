package hot_100.PascalsTriangle_118;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_java {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(numRows == 0)
            return res;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        res.add(a);
        for(int i =1 ; i < numRows; ++i){
            ArrayList<Integer> temp = new ArrayList<>();
            List<Integer> temp1 = res.get(i-1);
            for(int j = 0; j < i + 1; ++j){
                if(j -1 >= 0 && j < temp1.size()){
                    temp.add(temp1.get(j) + temp1.get(j - 1));
                }
                else if(j -1 < 0)
                    temp.add(1);
                else if(j >= temp1.size())
                    temp.add(1);
            }
            res.add(temp);
        }

        return res;
    }

}
