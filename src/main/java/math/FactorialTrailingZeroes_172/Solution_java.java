package math.FactorialTrailingZeroes_172;

public class Solution_java {
    public int trailingZeroes(int n) {
        int res = 0;
        while(n > 0){
            res += n/5;
            n /= 5;
        }
        return res;
    }
}
