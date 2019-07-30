package stack.validParentheses

import java.util.Stack
import scala.collection.mutable._

object validParentheses_scala {


  var mappings:HashMap[Char,Char]=new HashMap[Char,Char]()
  mappings.put(')', '(')
  mappings.put('}', '{')
  mappings.put(']', '[')
  def isValid(s: String): Boolean = {
    // Initialize a stack to be used in the algorithm.
    val stack: Stack[Character] = new Stack[Character]
    for(i<-0 until(s.length)){
      val c = s.charAt(i)
      if(mappings.keySet.contains(c)){
        val topElement = if (stack.empty) '#'
        else stack.pop
        if (topElement != mappings.get(c).get)
          return false
      } else stack.push(c)
    }
    stack.isEmpty
  }

  def main(args: Array[String]): Unit ={
    println(isValid("()"))
  }
}
