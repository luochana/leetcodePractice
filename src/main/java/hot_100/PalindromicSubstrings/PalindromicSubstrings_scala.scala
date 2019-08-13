package hot_100.PalindromicSubstrings

class PalindromicSubstrings_scala {

  def countSubstrings(s: String): Int = {
    var result = 0
    for(i<-0 until(s.length)) { //以当前点i位置，向两边扩展,以i i+1位置向两边扩展
      result += countSegment(s, i, i)
      result += countSegment(s, i, i + 1)
    }
    result
  }


  def countSegment(s: String, start: Int, end: Int): Int = {
    var count = 0
    var tempStart=start
    var tempEnd=end
    while (tempStart >= 0 && tempEnd < s.length() && s.charAt(tempStart) == s.charAt(tempEnd)){
      count+=1
      tempStart-=1
      tempEnd+=1
    }
    count
  }
}
