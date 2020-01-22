package array.SummaryRanges_228;

import java.util.ArrayList;
import java.util.List;

public class Solution_java {

    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();
        if(nums.length == 0)
            return res;
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        //标记是否是单个数字的区间
        boolean flag = false;
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] - nums[i - 1] != 1){
                if(flag){
                    sb.append("->" + nums[i - 1]);
                    res.add(sb.toString());
                    flag = false;
                }else{
                    res.add(sb.toString());
                }
                sb.delete(0, sb.length());
                sb.append(nums[i]);
            }else{
                flag = true;
            }
        }

        //处理最后一个区间
        if(flag){
            sb.append("->" + nums[nums.length - 1]);
            res.add(sb.toString());
        }else{
            res.add(sb.toString());
        }
        return  res;
    }
}
