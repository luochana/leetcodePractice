package hot_100.WordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
dp
这个方法的想法是对于给定的字符串（ss）可以被拆分成子问题 s1和 s2。如果这些子问题都可以独立地被拆分成符合要求的子问题，那么整个问题 ss 也可以满足。
*/

public class WordBreak_java {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
