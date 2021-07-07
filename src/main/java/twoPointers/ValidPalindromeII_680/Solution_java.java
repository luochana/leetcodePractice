package twoPointers.ValidPalindromeII_680;

public class Solution_java {
    public boolean validPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; ++i, --j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int low, int high){
        for(int i = low, j = high; i < j; ++i, --j){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_java solution_java = new Solution_java();
        System.out.println(solution_java.validPalindrome("deeee"));
    }
}
