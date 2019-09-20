package hot_100.MajorityElement

class MajorityElement_scala {
  def majorityElement(nums: Array[Int]): Int = {
    val length = nums.length
    var slow = 0
    var fast = 0
    val flag = new Array[Int](length)
    while (slow < length && fast < length) {
      if (nums(slow) == nums(fast))
        fast += 1;
      else if (flag(slow) == 0 && flag(fast) == 0) {
          flag(slow) = 1
          flag(fast) = 1
          slow += 1
          fast += 1
        }
      else if (flag(slow) == 1) {
          slow += 1;
          slow
        }
    }
    for(i <- 0 until(length))
      if (flag(i) == 0)
        return nums(i)
    return 0
  }
}
