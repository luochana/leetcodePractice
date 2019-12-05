package interviw_hot.OddEvenLinkedList_328;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class OddEvenLinkedList_java {
    public ListNode oddEvenList(ListNode head) {
        if (head ==null)
            return head;
        ListNode head1 = head;
        ListNode head2 = head.next;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.next.next != null){
                temp1.next = temp1.next.next;
                temp1 = temp1.next;
            }
            if(temp2.next == null ){
                temp2.next = null;
                break;
            }else if(temp2.next.next == null){
                temp2.next =null;
                break;
            }
            if(temp2.next.next != null){
                temp2.next = temp2.next.next;
                temp2 = temp2.next;
            }
        }
        temp1.next = head2;
        return head1;
    }

    public static void main(String[] args) {
        OddEvenLinkedList_java aa = new OddEvenLinkedList_java();
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i <= 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp.next =null;

        ListNode node = aa.oddEvenList(head);
        temp = node;
        while ((node != null)){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
