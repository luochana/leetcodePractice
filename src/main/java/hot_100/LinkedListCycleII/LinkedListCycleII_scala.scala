package hot_100.LinkedListCycleII

import java.util.HashSet

class LinkedListCycleII_scala {
  def detectCycle(head: ListNode): ListNode = {
    var node=head;
    var listNodes = new HashSet[ListNode]
    while ( node != null) {
      if (listNodes.contains(node)) return node
      else listNodes.add(node)
      node = node.next
    }
    null
  }
}
