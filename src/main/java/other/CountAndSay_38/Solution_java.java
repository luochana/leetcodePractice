package other.CountAndSay_38;

public class Solution_java {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1; i < n; ++i){
            res = solve(res);
        }
        return res;
    }
    public String solve(String str){
        StringBuffer sb = new StringBuffer();
        if(str.length() == 1){
            sb.append(1);
            sb.append(str);
            return sb.toString();
        }
        int num = 1;
        for(int i = 1; i < str.length(); ++i){
            if(str.charAt(i) != str.charAt(i - 1)){
                sb.append(String.valueOf(num));
                sb.append(str.charAt(i - 1));
                num = 1;
                if(i == str.length() -1){
                    sb.append(1);
                    sb.append(str.charAt(i));
                }
            }else{
                ++num;
                if(i == str.length() - 1){
                    sb.append(num);
                    sb.append(str.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution_java solution_java = new Solution_java();
        System.out.println(solution_java.countAndSay(6));
    }
}
