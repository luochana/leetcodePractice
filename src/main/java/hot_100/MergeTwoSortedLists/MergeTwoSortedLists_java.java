package hot_100.MergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeTwoSortedLists_java {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail=head;
        while(l1!=null||l2!=null){
            if(l1==null){
                tail.next=l2;
                tail=tail.next;
                l2=l2.next;
            }else if(l2==null){
                tail.next=l1;
                tail=tail.next;
                l1=l1.next;
            }else if(l1.val<=l2.val){
                tail.next=l1;
                tail=tail.next;
                l1=l1.next;
            }else {
                tail.next=l2;
                tail=tail.next;
                l2=l2.next;
            }
        }
        tail.next=null;
        return head.next;
    }
}
