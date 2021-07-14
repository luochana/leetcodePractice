package other.RomanToInteger_13;

import java.util.HashMap;

public class Solution_java {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0, flag = 0;
        while(flag < s.length()){
            if(flag + 1 < s.length() && map.get(s.charAt(flag)) < map.get(s.charAt(flag + 1))){
                res -= map.get(s.charAt(flag));
                res += map.get(s.charAt(flag + 1));
                flag += 2;
            }else{
                res += map.get(s.charAt(flag));
                ++flag;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_java solution_java = new Solution_java();
        System.out.println(solution_java.romanToInt("MCMXCIV"));
    }
}
