package hot_100.SortColors

class SortColors_scala {
  def sortColors(nums: Array[Int]): Unit = {
    var left = 0
    var right = nums.length - 1
    var current = 0
    var temp = 0
    while (current <= right) {
      if (nums(current) == 0){
        temp = nums(left)
        nums(left)=nums(current)
        nums(current)=temp
        left+=1
        current+=1
      }else if(nums(current)==2){
        temp=nums(current)
        nums(current)=nums(right)
        nums(right)=temp;
        right-=1
      }else {
        current += 1
      }
    }
  }
}
