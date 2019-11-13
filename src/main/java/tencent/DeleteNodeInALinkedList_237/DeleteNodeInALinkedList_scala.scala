package tencent.DeleteNodeInALinkedList_237

class DeleteNodeInALinkedList_scala {
  def deleteNode(node: ListNode): Unit = {
    node.`val` = node.next.`val`
    node.next = node.next.next
  }
}
