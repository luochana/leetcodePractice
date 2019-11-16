package tencent.ContainsDuplicate_217

import scala.collection.mutable

class ContainsDuplicate_scala {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    val ints = new mutable.HashSet[Int]()
    for (elem <- nums) {
      if(ints.contains(elem)) {
        return true
      }
      else {
        ints.add(elem)
      }
    }
      false
  }
}
