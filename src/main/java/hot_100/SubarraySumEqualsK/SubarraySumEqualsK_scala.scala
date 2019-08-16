package hot_100.SubarraySumEqualsK

import java.util.HashMap

class SubarraySumEqualsK_scala {
  def subarraySum(nums: Array[Int], k: Int): Int = {
    if (nums == null || nums.length == 0) return 0
    //dp[i]表示前i个数的和
    val dp = new Array[Int](nums.length + 1)
    for(i <- 1 to nums.length){
      dp(i) = dp(i - 1) + nums(i - 1)
    }
    var res = 0
    val map = new HashMap[Integer,Integer]()

    for(i <- 0 until(dp.length)){
      if (map.containsKey(dp(i) - k))
        res += map.get(dp(i) - k)
      map.put(dp(i), map.getOrDefault(dp(i), 0) + 1)
    }
    res
  }
}
