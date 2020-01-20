package bitManipulation.MaximumProductOfWordLengths_318;

public class Solution_java {
    
    public int maxProduct(String[] words) {

        //将每个单词转化为一个int型的"位"表示
        int[] arr = new int[words.length];
        for(int i = 0; i < words.length; ++i){
            for(int j = 0; j < words[i].length(); ++j){
                arr[i] |= (1 << (words[i].charAt(j) - 'a'));
            }
        }
        int res = 0;
        for(int i = 0; i < words.length - 1; ++i){
            for(int j = i + 1; j < words.length; ++j){
                if((arr[i] & arr[j]) == 0)
                    res = Math.max(res, words[i].length() * words[j].length());
            }
        }
        return res;
    }
}
