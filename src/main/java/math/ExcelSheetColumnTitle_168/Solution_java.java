package math.ExcelSheetColumnTitle_168;

public class Solution_java {
    public String convertToTitle(int n) {
        String res = "";
        while(n > 0){
            n--;
            res = (char)(n % 26 + 'A') + res;
            n /= 26;
        }
        return res;
    }
}
