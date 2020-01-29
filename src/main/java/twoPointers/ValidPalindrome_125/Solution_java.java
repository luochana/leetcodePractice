package twoPointers.ValidPalindrome_125;

public class Solution_java {
    public boolean isPalindrome(String s) {
        int left = 0;
        int rigth = s.length() - 1;

        while(left <= rigth){
            if(!check(s.charAt(left))){
                ++left;
                continue;
            }
            if(!check(s.charAt(rigth))){
                --rigth;
                continue;
            }
            if((s.charAt(left) == s.charAt(rigth)) || Math.abs(s.charAt(left) - s.charAt(rigth)) == 32){
                //大小写字母ascii码相差32对于‘0’和‘P’特例不适用
                if((s.charAt(left) == '0' && s.charAt(rigth) == 'P') || (s.charAt(left) == 'P' && s.charAt(rigth) == '0'))
                    return false;
                ++left;
                --rigth;
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean check(char c) {
        if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) || (c >= '0') && c <= '9') {
            return true;
        } else {
            return false;
        }
    }
}
