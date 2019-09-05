package hot_100.LongestIncreasingSubsequence

import java.util
import java.util.{Collection, HashMap, Map, Set}

class LongestIncreasingSubsequence_scala {
  def lengthOfLIS(nums: Array[Int]): Int = {
    if (nums.length == 0) return 0
    val map = new HashMap[Integer, Integer]
    map.put(nums(0), 1)
    if (nums.length >= 2) {
      for (i <- 1 until( nums.length)) {
        if (!map.containsKey(nums(i)))
          map.put(nums(i), 1)
        val temp = map.keySet
        var maxnun = 0
        import scala.collection.JavaConversions._
        for (j <- temp) {
          if (nums(i) > j)
            if (maxnun < map.get(j))
              maxnun = map.get(j)
        }
        map.put(nums(i), maxnun + 1)
      }
    }
    val res = map.values
    var max = -1000
    import scala.collection.JavaConversions._
    for (n <- res) {
      if (n > max)
        max = n
    }
    max
  }
}
