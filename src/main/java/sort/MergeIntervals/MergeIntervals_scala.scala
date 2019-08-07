package sort.MergeIntervals

import java.util.{ArrayList, Arrays, Comparator}

object MergeIntervals_scala {


  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {

    val res = new ArrayList[Array[Int]]
    if (intervals.length == 0 || intervals == null) return res.toArray(new Array[Array[Int]](0))

    Arrays.sort(intervals,new Comparator[Array[Int]] {
      override def compare(o1: Array[Int], o2: Array[Int]): Int = o1(0)-o2(0)
    })
    var i = 0
    while ( i < intervals.length) {
      val left = intervals(i)(0)
      var right = intervals(i)(1)
      while (i < intervals.length - 1 && intervals(i + 1)(0) <= right) {
        i += 1
        right = Math.max(right, intervals(i)(1))
      }
      res.add(Array[Int](left, right))
      i += 1
    }
    res.toArray(new Array[Array[Int]](0))
  }
}
