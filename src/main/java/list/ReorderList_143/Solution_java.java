package list.ReorderList_143;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

 //开辟O(n)存储空间的简单解法
public class Solution_java {

    public void reorderList(ListNode head) {
        if(head == null){
            return ;
        }
        int nodeNum = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            ++nodeNum;
        }
        //找到翻转的点
        nodeNum = nodeNum / 2 + 1;
        temp = head;
        while(nodeNum > 1){
            temp = temp.next;
            --nodeNum;
        }
        ListNode h1 = temp.next;
        temp.next = null;

        //将后半段入栈
        Stack<ListNode> stack = new Stack<>();
        while(h1 != null){
            stack.push(h1);
            h1 = h1.next;
        }

        //将栈中元素逐个插入
        temp = head;
        while(!stack.isEmpty()){
            ListNode cur = stack.pop();
            cur.next = temp.next;
            temp.next = cur;
            temp = cur.next;
        }
    }
}
