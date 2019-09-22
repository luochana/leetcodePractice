package hot_100.IntersectionOfTwoLinkedLists

class IntersectionOfTwoLinkedLists_scala {

  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
    if (headA == null || headB == null) return null
    var pA = headA
    var pB = headB
    while (pA ne pB) {
      pA =
        if (pA == null) headB
        else pA.next
      pB =
        if (pB == null) headA
        else pB.next
    }
    pA
  }
}
