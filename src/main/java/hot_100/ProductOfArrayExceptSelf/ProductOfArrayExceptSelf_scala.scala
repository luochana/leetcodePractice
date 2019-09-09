package hot_100.ProductOfArrayExceptSelf

class ProductOfArrayExceptSelf_scala {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val length = nums.length
    if (length == 0) return new Array[Int](0)
    if (length == 1) return nums
    val output = new Array[Int](length)
    output(length - 1) = nums(length - 1)
    for ( i<- (0 to (length-2)).reverse) {
      output(i) = output(i + 1) * nums(i)
    }
    var temp = 1
    for(i <- 0 until (length - 1)){
      output(i) = temp * output(i + 1)
      temp = temp * nums(i)
    }
    output(length - 1) = temp
    output
  }
}
