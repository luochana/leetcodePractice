package interviw_hot.BasicCalculatorII_227;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode-cn.com/problems/basic-calculator-ii/solution/shuang-zhan-fa-java-fu-hao-you-xian-ji-by-hao-man-/

public class Solution_java {
    public int calculate(String s) {
        //手写计算器 双栈法
        //加#号便于退栈
        String s1 = new StringBuffer(s).append("#").toString().replace(" ","");
        System.out.println(s1);
        Stack<Character> op = new Stack();
        Stack<Integer> data = new Stack();
        op.push('#');
        //双栈法
        /**
         * 1.规定优先级 # 0 , + - 1, * / 2
         * 2.操作数进操作数栈
         * 3.符号进符号栈 两点规则：如果当前符号优先级大于符号栈栈顶优先级，直接进
         * 如果当前符号优先级小于栈顶符号优先级 符号栈取栈顶元素退栈，操作数栈退栈两次
         */
        HashMap<Character,Integer> prioMap = new HashMap();
        prioMap.put('#',0);prioMap.put('+',1);prioMap.put('-',1);prioMap.put('*',2);prioMap.put('/',2);
        int i =0;

        while(s1.charAt(i)!='#'||op.peek()!='#'){
            //判断是不是操作符
            System.out.println(data);
            System.out.println(op);
            char u = s1.charAt(i);
            if(isOp(u)){
                //比较当前符号优先级
                if(prioMap.get(u)<=prioMap.get(op.peek())){
                    Character popOp = op.pop();
                    Integer p1 = data.pop();
                    Integer p2 = data.pop();
                    if(popOp=='*')  data.push(p2*p1);
                    if(popOp=='/')  data.push(p2/p1);
                    if(popOp=='+') data.push(p2+p1);
                    if(popOp=='-') data.push(p2-p1);
                }
                else{
                    op.push(u);
                    i++;
                }
            }else{
                //是数字
                int num = 0;
                while(!isOp(s1.charAt(i))){
                    num = num*10 + (s1.charAt(i)-'0');
                    i++;
                }
                data.push(num);
            }
        }
        return data.pop();
    }
    boolean isOp(char c){
        if(c=='+'||c=='-'||c=='*'||c=='/'||c=='#') return true;
        return false;
    }


    public static void main(String[] args) {
        Solution_java aaa = new Solution_java();
        aaa.calculate("1-1+1");
    }
}
