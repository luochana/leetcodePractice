package test.MeiTuan;
import java.util.*;
public class t2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        String[] strs = new String[length];
        for(int i = 0; i < length; ++i){
            strs[i] = in.nextLine();
        }
        while(in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int res = 0;
            while (res < strs[a - 1].length() && res < strs[b - 1].length() && strs[a - 1].charAt(res) == strs[b - 1].charAt(res)) {
                ++res;
            }
            System.out.println(res);
        }
    }
}
