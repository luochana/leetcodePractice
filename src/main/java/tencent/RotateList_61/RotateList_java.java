package tencent.RotateList_61;


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class RotateList_java {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode temp=head;
        int length=0;
        while (temp.next!=null){
            ++length;
            temp=temp.next;
        }
        ++length;
        temp.next=head;

        ListNode res=null;
        temp=head;

        for (int i = -k%length+length; i >0 ; i--) {
            temp=temp.next;
        }
        res=temp.next;
        temp.next=null;

        return res;
    }
}
