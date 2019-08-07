package twoPointers.longestPalindrome

object longestPalindrome_scala {

  def longestPalindrome(s:String):String={
    if (s == null || s.length() < 1)
      return ""
    var start=0
    var end=0
    for(i<-0 until(s.length)){
      val len1 = expandAroundCenter(s, i, i)
      val len2 = expandAroundCenter(s, i, i + 1)
      val len = Math.max(len1, len2)
      if (len > end - start) {
        start = i - (len - 1) / 2
        end = i + len / 2
      }
    }
    return s.substring(start, end + 1)
  }

  def  expandAroundCenter(s:String,left:Int,right:Int):Int={

    var L = left
    var R = right
    while ( {
      L >= 0 && R < s.length && s.charAt(L) == s.charAt(R)
    }) {
      L -= 1
      R += 1
    }
    return R - L - 1
  }
}
