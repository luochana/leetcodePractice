package hot_100.LinkedListCycle

class LinkedListCycle_scala {
  def hasCycle(head: ListNode): Boolean = {
    if (head == null) return false
    var fast = head
    var slow = head
    while (fast != null && fast.next != null) {
      fast = fast.next.next
      slow = slow.next
      if (fast==slow)
          return true
    }
    false
  }
}
