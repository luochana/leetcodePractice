package tencent.ReverseWordsInAStringIII_557;

public class ReverseWordsInAStringIII_java {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] split = s.split(" ");
        for (String s1 : split) {
            res.append(new StringBuilder(s1).reverse().toString()+" ");
        }
        return res.toString().trim();
    }
}
