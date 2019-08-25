package hot_100.PartitionEqualSubsetSum

class PartitionEqualSubsetSum_scala {
  def canPartition(nums: Array[Int]): Boolean = {
    if (nums == null || nums.length == 0) return false
    var sum = 0
    for (num <- nums) {
      sum += num
    }
    if (sum % 2 != 0) return false
    sum = sum / 2
    val res = new Array[Boolean](sum + 1)
    res(0) = true
    for (num <- nums) {
      var i = sum
      for ( i <-(num to sum).reverse) {
        res(i) = res(i) || res(i - num)
      }
    }
    res(sum)
  }
}
