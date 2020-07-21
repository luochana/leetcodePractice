package list.AddTwoNumbersII_445;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class Solution_java {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode node1 = null;
        ListNode node2 = null;
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            if(!s1.isEmpty()){
                carry += s1.pop();
            }
            if(!s2.isEmpty()){
                carry += s2.pop();
            }
            node1 = new ListNode(carry % 10);
            node1.next = node2;
            node2 = node1;
            carry /= 10;
        }
        return node2;
    }
}
