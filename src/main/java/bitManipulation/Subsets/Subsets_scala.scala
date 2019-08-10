package bitManipulation.Subsets

import java.util.{ArrayList, List}
import scala.collection.JavaConversions._

object Subsets_scala {
  def subsets(nums: Array[Int]): List[List[Int]] = {
    val res = new ArrayList[List[Int]]
    res.add(new ArrayList[Int])
    var i = 0
    while (i < nums.length) {
      val res1 = new ArrayList[List[Int]]
      for (n <- res)
        res1.add(new ArrayList[Int](n))
      for (x <- res1) {
        x.add(nums(i))
        res.add(x)
      }
      i+=i
    }
    res
  }
  def main(args: Array[String]): Unit ={
    println(subsets(Array[Int](1, 2, 3)).toString)
  }
}
