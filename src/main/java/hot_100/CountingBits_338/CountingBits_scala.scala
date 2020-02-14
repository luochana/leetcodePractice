package hot_100.CountingBits_338

/*
   dp,scala超时,和java写法一样.java超越80%
*/

class CountingBits_scala {
  def countBits(num: Int): Array[Int] = {
    val dp = new Array[Int](num + 1)
    dp(0) = 0
    if (num >= 1)
      dp(1) = 1
    var flag = 1
    var i = 2
    for (i <- 2 to num) {
      if (i / flag == 2) {
        dp(i) = 1
        flag *= 2
      }
      else
        dp(i) = dp(flag) + dp(i - flag)
    }
    dp
  }
}
