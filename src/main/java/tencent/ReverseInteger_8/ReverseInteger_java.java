package tencent.ReverseInteger_8;

public class ReverseInteger_java {
    public int reverse(int x) {
        String temp = String.valueOf(x);
        StringBuilder builder = new StringBuilder();
        if(temp.charAt(0) == '-'){
            builder.append('-');
            for (int i = temp.length()-1; i > 0 ; i--) {
                builder.append(temp.charAt(i));
            }
        }else{
            for (int i = temp.length()-1; i >= 0 ; i--) {
                builder.append(temp.charAt(i));
            }
        }
        long l = Long.parseLong(builder.toString());
        if(l > Integer.MAX_VALUE)
            return 0;
        else if(l < Integer.MIN_VALUE)
            return 0;

        else
            return (int)l;
    }

    public int reverse1(int x){
        int flag = 0;
        if(x > 0)
            flag = 1;
        if(x < 0)
            flag = -1;
        int res = 0;
        while(x != 0){
            int temp = x % 10;
            x /= 10;
            if(flag*res > Integer.MAX_VALUE/10 || (flag*res==Integer.MAX_VALUE/10)&&flag*x>Integer.MAX_VALUE%10)
                return 0;
            if(flag*res < Integer.MIN_VALUE/10 || (flag*res==Integer.MIN_VALUE/10)&&flag*x>Integer.MAX_VALUE%10)
                return 0;
            else
                res = res*10 + temp;
        }
        return res;
    }

    public static void main(String[] args) {
        ReverseInteger_java aaa = new ReverseInteger_java();
        System.out.println(aaa.reverse1(-123));
    }
}
