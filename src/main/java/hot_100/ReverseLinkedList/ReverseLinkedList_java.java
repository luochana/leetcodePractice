package hot_100.ReverseLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class ReverseLinkedList_java {

    //迭代. 0ms. java提交击败100%
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode temp1=null,temp2=null;
        while (head.next!=null){
            temp1=head.next;
            head.next=temp2;
            temp2=head;
            head=temp1;
            temp1=head.next;
        }
        head.next=temp2;
        return head;
    }

    //递归. java提交击败86%
    private ListNode res=null;
    public ListNode reverseList1(ListNode head)
    {
        if(head==null)
            return head;
        Recursive(head);
        head.next=null;
        return res;
    }
    public ListNode Recursive(ListNode node)
    {
        if(node.next!=null)
        {
            Recursive(node.next).next=node;
            return node;
        }
        else {
            res=node;
            return node;
        }
    }
}
