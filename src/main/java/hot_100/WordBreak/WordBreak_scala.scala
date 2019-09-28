package hot_100.WordBreak

import java.util.List
import java.util.HashSet

class WordBreak_scala {
/*
  def wordBreak(s: String, wordDict: List[String]): Boolean = {
    val wordDictSet = new HashSet[String](wordDict)
    val dp = new Array[Boolean](s.length + 1)
    dp(0) = true
    for(i <-1 to s.length){
      var j=0
      while(j<i)  {
        if (wordDictSet.contains(s.substring(j, i))&&dp(j)) {
          dp(i) = true
          j=i
        }
      }
    }
    dp(s.length+1)
  }*/
}
