package twoSum

 object twoSum_scala {
  def two_sum(nums:Array[Int],target:Int):Array[Int]=
  {
    var map:Map[Int,Int]=Map()
    for(i<- 0 to nums.length-1){
      map+=(nums(i)->i)
    }
    for(i<-0 to nums.length-1){
      val complement=target-nums(i)
      if(map.contains(complement)&&map.get(complement).get!=i){
        return Array[Int](i,map.get(complement).get)
      }
    }
    return Array()
  }
  def main(args: Array[String]): Unit ={
     val nums=Array(2, 7, 11, 15)
     val result=two_sum(nums,9)
    for(i<-0 to result.length-1)
      println(result(i))
  }
}
