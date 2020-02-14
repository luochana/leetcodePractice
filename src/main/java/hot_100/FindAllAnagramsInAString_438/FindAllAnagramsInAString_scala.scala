package hot_100.FindAllAnagramsInAString_438

import java.util
import java.util.{ArrayList, Arrays, List}

class FindAllAnagramsInAString_scala {
  def findAnagrams(s: String, p: String):ArrayList[Integer] = {
    val result = new ArrayList[Integer]
    val sChar = s.toCharArray
    val pChar = p.toCharArray
    val curAToZ = new Array[Int](26)
    val aToZ = new Array[Int](26)
    for (c <- pChar) {
      aToZ(c - 'a') += 1
    }

    for ( i <- 0 until( sChar.length))
    {
      if (i >= pChar.length)
        curAToZ(sChar(i - pChar.length) - 'a') -= 1
      curAToZ(sChar(i) - 'a') += 1
      if (util.Arrays.equals(curAToZ, aToZ))
        result.add(i - pChar.length + 1)
    }
    result
  }

}
