package tencent.DeleteNodeInALinkedList_237;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
public class DeleteNodeInALinkedList_java {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
