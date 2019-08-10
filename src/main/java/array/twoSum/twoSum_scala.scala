package array.twoSum

 object twoSum_scala {
   def twoSum(nums: Array[Int], target: Int): Array[Int] = {

     var map:Map[Int,Int]=Map()
     for(i<- 0 to nums.length-1){
       map+=(nums(i)->i)
     }
     for(i<-0 to nums.length-1){
       val complement=target-nums(i)
       if(map.contains(complement)&&map.get(complement).get!=i){
         val temp=map.get(complement).get
         return Array[Int](i,temp.asInstanceOf[Int])
       }
     }
     return Array()

   }
  def main(args: Array[String]): Unit ={
     val nums=Array(2, 7, 11, 15)
     val result=twoSum(nums,9)
    for(i<-0 to result.length-1)
      println(result(i))
  }
}
