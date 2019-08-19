package hot_100.HammingDistance

class HammingDistance_scala {
  def hammingDistance(x: Int, y: Int): Int = {
    //bitCount 数出整数二进制下 1 的个数
    //1^0 = 1 ,0^1 =1 ,0^0 = 0 ,1^1 = 0
    Integer.bitCount(x ^ y)
  }

}
