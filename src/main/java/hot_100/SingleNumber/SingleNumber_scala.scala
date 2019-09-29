package hot_100.SingleNumber

import java.util.HashMap

class SingleNumber_scala {
  def singleNumber(nums: Array[Int]): Int = {
    val map = new HashMap[Integer, Integer]
    for (i <- nums) {
      var count = map.get(i)
      count = if (count == null) 1
      else {
        count += 1; count
      }
      map.put(i, count)
    }
    import scala.collection.JavaConversions._
    for (i <- map.keySet) {
      val count = map.get(i)
      if (count == 1) return i
    }
    -1 // can't find it.
  }
}
