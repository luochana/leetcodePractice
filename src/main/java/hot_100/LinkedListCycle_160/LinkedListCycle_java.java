package hot_100.LinkedListCycle_160;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class LinkedListCycle_java {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
