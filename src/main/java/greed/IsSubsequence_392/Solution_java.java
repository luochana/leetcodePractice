package greed.IsSubsequence_392;

public class Solution_java {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i = 0; i < t.length(); ++i){
            if(j < s.length()){
                if(s.charAt(j) == t.charAt(i)){
                    ++j;
                }
            }else{
                return true;
            }
        }
        return  false;
    }

    public boolean isSubsequence1(String s, String t) {
        char[] chars=s.toCharArray();
        int index=-1;
        for(char temp:chars){
            index=t.indexOf(temp,index+1);
            if(index==-1){
                return false;
            }
        }
        return true;
    }

}
