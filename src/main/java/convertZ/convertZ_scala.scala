package convertZ

import java.util.ArrayList
import scala.collection.JavaConversions._

class convertZ_scala {
  def convert(s:String,numRows:Int):String={
    if (numRows == 1)
      return s
    var rows:ArrayList[StringBuilder]=new ArrayList[StringBuilder]()
    for (i <- 0 until ( Math.min(numRows, s.length())))
      rows.add(new StringBuilder());
    var curRow = 0
    var goingDown = false

    for (c <- s.toCharArray) {
      rows.get(curRow).append(c)
      if (curRow == 0 || curRow == numRows - 1)
        goingDown = !goingDown
      if(goingDown)
        curRow+=1
      else
        curRow-=1
    }

    val ret = new StringBuilder
    for (row <- rows) {
      ret.append(row)
    }
    return ret.toString
  }

}
