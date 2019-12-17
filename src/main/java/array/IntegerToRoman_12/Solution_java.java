package array.IntegerToRoman_12;

import java.util.HashMap;

public class Solution_java {
    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        int[] nums = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(num > 0 && i < 13){
            if(nums[i] > num){
                ++i;
            }else{
                sb.append(map.get(nums[i]));
                num -= nums[i];
            }
        }
        return sb.toString();
    }
}
