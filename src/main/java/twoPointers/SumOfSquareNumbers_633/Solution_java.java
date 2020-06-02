package twoPointers.SumOfSquareNumbers_633;
import java.util.*;

public class Solution_java {
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int)Math.sqrt(c);
        while(i <= j){
            int temp = i * i + j * j;
            if(temp == c){
                return true;
            }
            if(temp > c){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
