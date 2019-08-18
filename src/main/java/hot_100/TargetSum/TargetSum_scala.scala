package hot_100.TargetSum

class TargetSum_scala {

  def findTargetSumWays(nums: Array[Int], S: Int): Int = {
    var sum = 0
    for (num <- nums) {
      sum += num
    }
    if (sum < S || (sum + S) % 2 == 1) return 0
    val w = (sum + S) / 2
    val dp = new Array[Int](w + 1)
    dp(0) = 1
    for (num <- nums) {
      for(j<-(num to w).reverse){
        dp(j)+=dp(j-num)
      }
    }
    dp(w)
  }
}
