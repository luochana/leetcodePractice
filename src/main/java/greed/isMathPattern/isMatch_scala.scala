package greed.isMathPattern

class isMatch_scala {
  def isMatch(str: String, pattern: String): Boolean = {
    var s = 0
    var p = 0
    var `match` = 0
    var starIdx = -1
    //遍历整个字符串
    while (s < str.length) { // 一对一匹配，两指针同时后移。
      if (p < pattern.length && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))) {
        s += 1
        p += 1
      }
      // 碰到 *，假设它匹配空串，并且用 startIdx 记录 * 的位置，记录当前字符串的位置，p 后移
      else if (p < pattern.length && pattern.charAt(p) == '*') {
          starIdx = p
          `match` = s
          p += 1
      }
      else if (starIdx != -1) {
        p = starIdx + 1
        `match` += 1
        s = `match`
      }
      else  //字符不匹配，也没有 *，返回 false
        return false
    }
    //将末尾多余的 * 直接匹配空串 例如 text = ab, pattern = a*******
    while (p < pattern.length && pattern.charAt(p) == '*')
      p += 1
    p == pattern.length
  }

}
