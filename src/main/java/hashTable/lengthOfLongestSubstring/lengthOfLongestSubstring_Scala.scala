package hashTable.lengthOfLongestSubstring

import scala.collection.immutable.HashMap


object lengthOfLongestSubstring_Scala {

  def lengthOfLongestSubstring(s:String):Int={
    var n=s.length
    var ans: Int = 0
    var map:HashMap[Char, Int]=new HashMap[Char,Int]
    var i = 0
    for (j<-0 until n){
      if (map.contains(s.charAt(j))) {
        i = Math.max(map.get(s.charAt(j)).get,i)
      }
      ans = Math.max(ans, j - i + 1)
      map+=(s.charAt(j)->(j + 1))
    }
    return ans
  }

  def main(args: Array[String]): Unit ={
    println(lengthOfLongestSubstring("fdgfghghjhjhhjhj"))
  }
}
