package hot_100.KthLargestElementInAnArray

import java.util.PriorityQueue

class KthLargestElementInAnArray_scala {
  def comp(a:Integer):Int={a}
  def findKthLargest(nums: Array[Int], k: Int): Int = { // init heap 'the smallest element first'
    val heap = new PriorityQueue[Integer](Ordering.by(comp))
    // keep k largest elements in the heap
    for (n <- nums) {
      heap.add(n)
      if (heap.size > k) heap.poll
    }
    // output
    heap.poll
  }
}
