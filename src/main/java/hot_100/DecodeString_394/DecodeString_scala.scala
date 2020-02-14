package hot_100.DecodeString_394

import java.util.LinkedList

class DecodeString_scala {
  def decodeString(s: String): String = {
    val builder = new StringBuilder
    val numStack = new LinkedList[Integer]
    val stringStack = new LinkedList[String]
    var num = 0
    for (c <- s.toCharArray) {
      if (c >= '0' && c <= '9') { //1
        num = num * 10 + c - '0'
      }
      else if (c == '[') { //2
        numStack.addLast(num)
        stringStack.addLast(builder.toString)
        builder.delete(0, builder.length)
        num = 0
      }
      else if (c == ']') { //4
        val item = builder.toString
        val numItem = numStack.removeLast
        for ( i <- 1 until  numItem) {
          builder.append(item)
        }
        builder.insert(0, stringStack.removeLast)
      }
      else { //3
        builder.append(c)
      }
    }
    builder.toString
  }
}
