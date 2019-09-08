package hot_100.SlidingWindowMaximum

import java.util.ArrayDeque

//提交没通过,拿错误用例本地测试没问题....
object SlidingWindowMaximum_scala {
   val deq = new ArrayDeque[Integer]
   var nums:Array[Int] = null

  def clean_deque(i: Int, k: Int): Unit = { // remove indexes of elements not from sliding window
    if (!deq.isEmpty && (deq.getFirst ==i - k))
      deq.removeFirst
    // remove from deq indexes of all elements
    // which are smaller than current element nums[i]
    while (!deq.isEmpty && nums(i) > nums(deq.getLast))
      deq.removeLast
  }

  def maxSlidingWindow(nums: Array[Int], k: Int): Array[Int] = {
    val n = nums.length
    if (n * k == 0) return new Array[Int](0)
    if (k == 1) return nums
    // init deque and output
    this.nums = nums
    var max_idx = 0
    for( i <-0 until(k)) {
      clean_deque(i, k)
      deq.addLast(i)
      // compute max in nums[:k]
      if (nums(i) > nums(max_idx))
        max_idx = i
    }
    val output = new Array[Int](n - k + 1)
    output(0) = nums(max_idx)
    // build output
    for (i <-k until(n)) {
      clean_deque(i, k)
      deq.addLast(i)
      output(i - k + 1) = nums(deq.getFirst)
    }
    output
  }

  def main(arges: Array[String]): Unit= {
  //  val a=new Array[Int](2)
    var z = Array(9,11)
    println(maxSlidingWindow(z,2)(0))
  }
}
