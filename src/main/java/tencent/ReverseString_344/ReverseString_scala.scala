package tencent.ReverseString_344

class ReverseString_scala {
  def reverseString(s: Array[Char]): Unit = {
    if(s.length==0)
      return
    var l=0;
    var r=s.length-1;
    while(l<r){
      var temp = s(l)
      s(l) = s(r)
      s(r) = temp
      l += 1
      r -= 1
    }
  }
}
