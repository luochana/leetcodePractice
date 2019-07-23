package findMedianSortedArrays

object findMedianSortedArrays_Scala {
  def findMedianSortedArrays(A: Array[Int], B: Array[Int]):Double={
    var A1=A
    var B1=B
    var m=A.length
    var n=B.length
    if(m>n){
      var temp=m
      m=n
      n=temp
      var tempArr=A1
      A1=B1
      B1=tempArr
    }
    var iMin=0
    var iMax=m
    var halfLen=(m+n+1)/2
    while(iMin<=iMax){
      val i=(iMax+iMin)/2
      val j=halfLen-i
      if (i < iMax && B1(j-1) > A1(i)){
        iMin = i + 1; // i is too small
      }
      else if (i > iMin && A1(i-1) > B1(j)) {
        iMax = i - 1; // i is too big
      }
      else{ //i is perfect
        var maxLeft: Int = 0
        if (i == 0) {
          maxLeft = B1(j - 1)
        }
        else {
          if (j == 0) {
            maxLeft = A1(i - 1)
          }
          else {
            maxLeft = Math.max(A1(i - 1), B1(j - 1))
          }
        }
        if ((m + n) % 2 == 1) {
          return maxLeft
        }

        var minRight: Int = 0
        if (i == m) {
          minRight = B1(j)
        }
        else {
          if (j == n) {
            minRight = A1(i)
          }
          else {
            minRight = Math.min(B1(j), A1(i))
          }
        }

        return (maxLeft + minRight) / 2.0
      }
    }
    return  0.0
  }

}