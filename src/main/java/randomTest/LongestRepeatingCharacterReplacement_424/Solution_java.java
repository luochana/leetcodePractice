package randomTest.LongestRepeatingCharacterReplacement_424;

public class Solution_java {
    public int characterReplacement(String s, int k) {
        int n = s.length(), res = 0, l = 0, r = 0, ma = 0;
        int[] b = new int[26];
        for (r = 0; r < n; r++) {
            int now = s.charAt(r) - 'A';
            b[now]++;
            ma = Math.max(ma, b[now]);
            if (ma + k < r - l + 1) {
                b[s.charAt(l) - 'A']--;
                l++;
            }
        }
        return n - l;
    }
}
