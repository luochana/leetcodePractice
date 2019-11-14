package tencent.PowerOfTwo_231

class PowerOfTwo_scala {
  def isPowerOfTwo(n: Int): Boolean = n > 0 && (n & (n - 1)) == 0
}
