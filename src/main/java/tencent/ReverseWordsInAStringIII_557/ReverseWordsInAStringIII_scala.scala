package tencent.ReverseWordsInAStringIII_557

class ReverseWordsInAStringIII_scala {
  def reverseWords(s: String): String = {
    val res = new StringBuilder
    val split = s.split(" ")
    for (s1 <- split) {
      res.append(new StringBuilder(s1).reverse.toString + " ")
    }
    res.toString.trim
  }
}
