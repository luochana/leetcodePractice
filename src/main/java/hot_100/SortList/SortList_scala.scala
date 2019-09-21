package hot_100.SortList

class SortList_scala {
  def sortList(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    var fast = head.next
    var slow = head
    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
    }
    val tmp = slow.next
    slow.next = null
    var left = sortList(head)
    var right = sortList(tmp)
    var h = new ListNode(0)
    val res = h
    while (left != null && right != null) {
      if (left.`val` < right.`val`) {
        h.next = left
        left = left.next
      }
      else {
        h.next = right
        right = right.next
      }
      h = h.next
    }
    h.next =
      if (left != null) left
      else right
    res.next
  }
}
