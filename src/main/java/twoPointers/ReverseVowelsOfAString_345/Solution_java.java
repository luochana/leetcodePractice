package twoPointers.ReverseVowelsOfAString_345;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_java {
    private static final HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
    );
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while(i <= j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!vowels.contains(ci)){
                result[i] = s.charAt(i);
                ++i;
            }
            if(!vowels.contains(cj)){
                result[j] = s.charAt(j);
                --j;
            }
            if(vowels.contains(ci) && vowels.contains(cj)){
                result[i] = cj;
                result[j] = ci;
                ++i;
                --j;
            }
        }
        return new String(result);

    }
}
