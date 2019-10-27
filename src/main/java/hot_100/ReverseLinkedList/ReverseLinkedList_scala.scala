package hot_100.ReverseLinkedList

/*class ReverseLinkedList_scala {
  def reverseList(head: ListNode): ListNode = {
    if (head == null)
      return head
    var temhead=head;
    var temp1 = new ListNode()
    var temp2 = new ListNode()
    while (temhead.next != null) {
      temp1 = temhead.next
      temhead.next = temp2
      temp2 = temhead
      temhead = temp1
      temp1 = temhead.next
    }
    head.next=null
    temhead.next = temp2
    temhead
  }
}*/
