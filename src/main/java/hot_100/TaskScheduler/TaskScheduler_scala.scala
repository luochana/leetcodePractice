package hot_100.TaskScheduler

import java.util.Arrays

object TaskScheduler_scala {
  def leastInterval(tasks: Array[Char], n: Int): Int = {
    val count = new Array[Int](26)
    for(i<-0 until(tasks.length)){
      count(tasks(i)-'A')+=1
    }
    Arrays.sort(count)
    var maxCount = 0
    var i=25
    while(i>=0){
      if(count(i)!=count(25))
        i=(-1)
      else{
        maxCount+=1
        i-=1
      }
    }
    return Math.max((count(25) - 1) * (n + 1) + maxCount, tasks.length)
  }

  def main(args:Array[String]):Unit={

    var a=new Array[Char](6)
    a(0)="A".charAt(0)
    a(1)="A".charAt(0)
    a(2)="A".charAt(0)
    a(3)="B".charAt(0)
    a(4)="B".charAt(0)
    a(5)="B".charAt(0)
    println(leastInterval(a,2))
  }

}
