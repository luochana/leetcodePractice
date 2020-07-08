package hot_100.WordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
dp
这个方法的想法是对于给定的字符串（ss）可以被拆分成子问题 s1和 s2。如果这些子问题都可以独立地被拆分成符合要求的子问题，那么整个问题 ss 也可以满足。
*/


//求解顺序的完全背包问题时,对物品的迭代应该放在最里层
public class WordBreak_java {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                // 对物品的迭代应该放在最里层
                int len = word.length();
                if (len <= i && word.equals(s.substring(i - len, i))) {
                    dp[i] = dp[i] || dp[i - len];
                }
            }
        }
        return dp[n];
    }
}
