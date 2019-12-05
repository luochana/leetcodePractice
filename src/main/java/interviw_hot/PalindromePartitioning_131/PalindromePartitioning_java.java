package interviw_hot.PalindromePartitioning_131;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_java {
    List<List<String>> res = new ArrayList<>();
    //StringBuilder builder = new StringBuilder();
    List<String> list = new ArrayList<>();
    public List<List<String>> partition(String s) {
        process(s,0);
        return res;
    }

    public void process(String s,int i){
        for(int j = i; j < s.length(); ++j){
            if(isHuiWen(s,i,j)){
                list.add(s.substring(i,j+1));
                process(s,j+1);
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isHuiWen(String s, int left, int right){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            ++left;
            --right;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitioning_java aaa = new PalindromePartitioning_java();
        List<List<String>> aab = aaa.partition("aab");
        for (List<String> list : aab) {
            System.out.println(list);
        }
    }
}
