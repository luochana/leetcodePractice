package interviw_hot.EvaluateReversePolishNotation_150;

import java.util.Stack;

public class Solution_java {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }else if(s.equals("*")){
                stack.push(stack.pop() * stack.pop()) ;
            }else if(s.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
