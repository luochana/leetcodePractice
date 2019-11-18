package tencent.GrayCode_89

import scala.collection.mutable.ArrayBuffer


class GrayCode_scala {
  def grayCode(n: Int): List[Int] = {
    val ints = new ArrayBuffer[Int]()
    ints.append(0)
    var head = 1
    for(i <- 0 until(n)){
      for(j <- (0 until  ints.size).reverse ){
        ints.append(head+ints(j))
      }
      head<<=1
    }
    ints.toList
  }
}
