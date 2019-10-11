package hot_100.UniqueBinarySearchTrees

class UniqueBinarySearchTrees_scala {

  //题解: https://leetcode-cn.com/problems/unique-binary-search-trees/solution/bu-tong-de-er-cha-sou-suo-shu-by-leetcode/
  def numTrees(n: Int): Int = {
    val G = new Array[Int](n + 1)
    G(0) = 1
    G(1) = 1
    for (i <- 2 to n) {
      var j = 1
      for(j <-1 to i) {
        G(i) += G(j - 1) * G(i - j)
      }
    }
    G(n)
  }
}
