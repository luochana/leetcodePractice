package interviw_hot.DecodeWays_91;

public class Solution_java {

    //暴力递归超时；
    int res = 0;
    public int numDecodings(String s) {
        if(s.length() == 0)
            return 0;
        process(s, 0);
        return res;
    }
    void process(String s, int location){
        if(s.length() <= location){
            return;
        }
        if(s.charAt(location) - '0' >= 1 && s.charAt(location) - '0' <= 9 ){
            if(s.length() == location + 1)
                ++res;
            process(s, location + 1);
        }
        if(location <= s.length() - 2 && Integer.parseInt(s.substring(location, location + 2)) <= 26 &&
                Integer.parseInt(s.substring(location, location + 2)) >= 10){
            if(s.length() == location + 2)
                ++res;
            process(s, location + 2);
        }
    }



    // https://leetcode-cn.com/problems/decode-ways/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-2-3/
    public int numDecodings1(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[len] = 1; //将递归法的结束条件初始化为 1
        //最后一个数字不等于 0 就初始化为 1
        if (s.charAt(len - 1) != '0') {
            dp[len - 1] = 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            //当前数字时 0 ，直接跳过，0 不代表任何字母
            if (s.charAt(i) == '0') {
                continue;
            }
            int ans1 = dp[i + 1];
            //判断两个字母组成的数字是否小于等于 26
            int ans2 = 0;
            int ten = (s.charAt(i) - '0') * 10;
            int one = s.charAt(i + 1) - '0';
            if (ten + one <= 26) {
                ans2 = dp[i + 2];
            }
            dp[i] = ans1 + ans2;

        }
        return dp[0];
    }




    public static void main(String[] args) {
        Solution_java aaa = new Solution_java();
        System.out.println(aaa.numDecodings("7541387519572282368613553811323167125532172369624572591562685959575371877973171856836975137559677665"));
    }
}
