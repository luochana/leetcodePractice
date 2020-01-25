package list.SwapNodesInPairs_24;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }


public class Solution_java {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode h1 = newHead;
        ListNode h2 = head;

        while(h1.next != null && h2.next != null){
            h1.next = h2.next;
            h2.next = h2.next.next;
            h1.next.next = h2;
            h2 = h2.next;
            h1 = h1.next.next;
        }
        return newHead.next;
    }
}
