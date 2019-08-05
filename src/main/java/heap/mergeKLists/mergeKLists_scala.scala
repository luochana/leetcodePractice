package heap.mergeKLists

import scala.collection.mutable.PriorityQueue


object mergeKLists_scala {

  def mergeKLists(lists:Array[ListNode]):ListNode={

    val len=lists.length
    if(len==0)
      return null

    def diff(t2:ListNode) =(-t2.`val`)
    val priorityQueue = new PriorityQueue[ListNode]()(Ordering.by(diff))
    val dummyNode = new ListNode(-1)
    var curNode = dummyNode

    for (list <- lists) {
      if (list != null) { // 这一步很关键，不能也没有必要将空对象添加到优先队列中
        priorityQueue.enqueue(list)
      }
    }

    while (!priorityQueue.isEmpty) { // 优先队列非空才能出队
      val node = priorityQueue.dequeue()
      // 当前节点的 next 指针指向出队元素
      curNode.next = node
      // 当前指针向前移动一个元素，指向了刚刚出队的那个元素
      curNode = curNode.next
      if (curNode.next != null) { // 只有非空节点才能加入到优先队列中
        priorityQueue.enqueue(curNode.next)
      }
    }
    return dummyNode.next
  }
}
