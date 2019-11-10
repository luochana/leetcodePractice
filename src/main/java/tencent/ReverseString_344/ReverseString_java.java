package tencent.ReverseString_344;

public class ReverseString_java {
    public void reverseString(char[] s) {
        if(s.length==0)
            return;
        int r=s.length-1,l=0;
        char temp;
        while (l<r){
            temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            ++l;
            --r;
        }
    }
}
