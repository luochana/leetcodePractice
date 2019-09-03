package hot_100.MoveZeroes

class MoveZeroes_scala {
  def moveZeroes(nums: Array[Int]): Unit = {
    var count = 0
    for ( i <- 0 until(nums.length)) {
      if (nums(i) == 0)
        count += 1
      else
        nums(i - count) = nums(i)
    }
    for ( i <-(nums.length - count) until( nums.length)) {
      nums(i) = 0
    }
  }
}
