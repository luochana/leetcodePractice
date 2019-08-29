package hot_100.DecodeString;

import java.util.LinkedList;

public class DecodeString_java {
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

    public static void main(String[] args) {
        DecodeString_java a=new DecodeString_java();
        System.out.println(a.decodeString("3[a]2[bc]"));
    }
}
