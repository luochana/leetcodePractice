package hot_100.FindTheDuplicateNumber

import java.util.{HashSet, Set}

class FindTheDuplicateNumber_scala {
  def findDuplicate(nums: Array[Int]): Int = {
    val seen = new HashSet[Integer]
    for (num <- nums) {
      if (seen.contains(num)) return num
      seen.add(num)
    }
    -1
  }
}
