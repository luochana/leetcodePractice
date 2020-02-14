package hot_100.DecodeString_394;

import java.util.LinkedList;

public class DecodeString_java {
    /*
     * 解题思路：
     * 将decodeStr拆解后会有四种可能：数字、字母、[、]
     * 使用栈保存遍历的结果，numStack保存数字，stringStack保存字母
     * 例:3[a2[c]]
     * 1、遇到数字：计算数字的大小，注意连续数字的情况
     * 2、遇到左括号：将之前得到的数字入栈，之前得到的字母也入栈，情况数字和字母
     * 3、遇到字母：累加连续字母
     * 4、遇到右括号：将数字出栈，将累加字母根据数字翻倍，将字母也出栈，和翻倍字母拼接
     * 5、循环1-4
     */
    public String decodeString(String s) {
        StringBuilder builder = new StringBuilder();
        LinkedList<Integer> numStack = new LinkedList<>();
        LinkedList<String> stringStack = new LinkedList<>();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                //1
                num = num * 10 + c - '0';
            } else if (c == '[') {
                //2
                numStack.addLast(num);
                stringStack.addLast(builder.toString());
                builder.delete(0, builder.length());
                num = 0;
            } else if (c == ']') {
                //4
                String item = builder.toString();
                Integer numItem = numStack.removeLast();
                for (int i = 1; i < numItem; i++) {
                    builder.append(item);
                }
                builder.insert(0, stringStack.removeLast());
            } else {
                //3
                builder.append(c);
            }
        }

        return builder.toString();
    }




    //方法二：
    //https://leetcode-cn.com/problems/decode-string/solution/decode-string-fu-zhu-zhan-fa-di-gui-fa-by-jyd/
    public String decodeString1(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for(Character c : s.toCharArray()) {
            if(c == '[') {
                stack_multi.addLast(multi);
                stack_res.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            }
            else if(c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stack_multi.removeLast();
                for(int i = 0; i < cur_multi; i++)
                    tmp.append(res);
                res = new StringBuilder(stack_res.removeLast() + tmp);
            }
            else if(c >= '0' && c <= '9')
                multi = multi * 10 + Integer.parseInt(c + "");
            else
                res.append(c);
        }
        return res.toString();
    }


    public static void main(String[] args) {
        DecodeString_java a=new DecodeString_java();
        System.out.println(a.decodeString("3[a]2[bc]"));
    }
}
