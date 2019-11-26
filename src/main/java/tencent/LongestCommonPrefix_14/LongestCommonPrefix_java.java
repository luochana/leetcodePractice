package tencent.LongestCommonPrefix_14;

public class LongestCommonPrefix_java {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if(!(i < strs[j].length() && strs[0].charAt(i) == strs[j].charAt(i)))
                    return res.toString();
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}
