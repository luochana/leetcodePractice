package addTwoNumbers

 class ListNode_s(var _x: Int = 0) {
   var next: ListNode_s = null
   var x: Int = _x
 }

class addTwoNumbersScala {

  def addTwoNumbers(l1: ListNode_s, l2: ListNode_s): ListNode_s = {
    var dummyHead:ListNode_s=new ListNode_s(0)
    var p = l1
    var q = l2
    var curr = dummyHead
    var carry:Int=0
    while (p != null || q != null){
      var x = 0
      var y=0
      if(p!=null) x=p.x
      if(q!=null) y=q.x
      var sum = carry + x + y
      carry = sum / 10
      curr.next = new ListNode_s(sum % 10)
      curr = curr.next
      if (p != null) p = p.next
      if (q != null) q = q.next
    }
    if (carry > 0) {
      curr.next = new ListNode_s(carry)
    }
    return dummyHead.next
  }
}
