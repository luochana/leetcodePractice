package tencent.MergeSortedArray_88

class MergeSortedArray_scala {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    val nums1_copy = new Array[Int](m)
    System.arraycopy(nums1, 0, nums1_copy, 0, m)
    var p = 0
    var q = 0
    var i = 0
    while (p<m && q<n){
      if(nums1_copy(p)<nums2(q)){
        nums1(i)=nums1_copy(p);
        i+=1
        p+=1
      }else if(nums1_copy(p)>nums2(q)){
        nums1(i)=nums2(q)
        i+=1
        q+=1
      }else{
        nums1(i)=nums1_copy(p);
        i+=1
        p+=1
        nums1(i)=nums2(q)
        i+=1
        q+=1
      }
    }
    while (p<m){
      nums1(i)=nums1_copy(p);
      i+=1
      p+=1
    }
    while(q<n){
      nums1(i)=nums2(q)
      i+=1
      q+=1
    }
  }
}
