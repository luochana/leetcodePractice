
//没通过,原因在找
package hot_100.DailyTemperatures_739

object DailyTemperatures_scala {
  def dailyTemperatures(T: Array[Int]): Array[Int] = {
    val length = T.length
    val result = new Array[Int](length)
    //从右向左遍历
    var i = length - 2
    while (i >= 0) { // j+= result[j]是利用已经有的结果进行跳跃
      var j = i + 1
      var flag=true
      while (j < length&&flag) {
        if (T(j) > T(i)) {
          result(i) = j - i
           flag=false//break
        }
        else if (result(j) == 0) { //遇到0表示后面不会有更大的值，那当然当前值就应该也为0
          result(i) = 0
          flag=false//break
        }
        j += result(j)
      }
        i -= 1
    }
    result
  }

  def main(args: Array[String]): Unit ={
    dailyTemperatures(Array[Int](73, 74, 75, 71, 69, 72, 76, 73))
  }
}
