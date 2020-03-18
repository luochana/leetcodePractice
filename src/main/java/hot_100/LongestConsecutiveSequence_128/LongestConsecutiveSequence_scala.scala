package hot_100.LongestConsecutiveSequence_128

import java.util.HashSet

class LongestConsecutiveSequence_scala {
  def longestConsecutive(nums: Array[Int]): Int = {
    val num_set = new HashSet[Integer]
    for (num <- nums) {
      num_set.add(num)
    }
    var longestStreak = 0
    import scala.collection.JavaConversions._
    for (num <- num_set) {
      if (!num_set.contains(num - 1)) {
        var currentNum = num
        var currentStreak = 1
        while (num_set.contains(currentNum + 1)) {
          currentNum += 1
          currentStreak += 1
        }
        longestStreak = Math.max(longestStreak, currentStreak)
      }
    }
    longestStreak
  }
}
