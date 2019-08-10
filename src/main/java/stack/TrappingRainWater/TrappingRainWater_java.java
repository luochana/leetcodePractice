package stack.TrappingRainWater;

import java.util.Stack;

import static java.lang.Integer.min;

public class TrappingRainWater_java {

    public int trap(int[] height) {

        int ans=0,current=0;
        Stack<Integer> st=new Stack<>();
        while(current<height.length)
        {
            while (!st.empty()&&height[current]>height[st.peek()])
            {
                int top=st.peek();
                st.pop();
                if(st.isEmpty())
                    break;
                int distance = current - st.peek() - 1;
                int bounded_height = min(height[current], height[st.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            st.push(current++);
        }
        return ans;
    }

    public static void main(String[] args) {
        TrappingRainWater_java a=new TrappingRainWater_java();
        System.out.println(a.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
