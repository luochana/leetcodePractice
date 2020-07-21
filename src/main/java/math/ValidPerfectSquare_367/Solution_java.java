package math.ValidPerfectSquare_367;

public class Solution_java {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while(num > 0){
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
