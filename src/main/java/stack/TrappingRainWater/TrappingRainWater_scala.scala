package stack.TrappingRainWater

import java.util.Stack

class TrappingRainWater_scala {
  def trap(height: Array[Int]): Int = {
    var ans = 0
    var current = 0
    val st = new Stack[Integer]
    while (current < height.length) {
      while (!st.empty && height(current) > height(st.peek)) {
        val top = st.peek
        st.pop
        if (!st.isEmpty){
          val distance = current - st.peek - 1
          val bounded_height = Math.min(height(current), height(st.peek)) - height(top)
          ans += distance * bounded_height
        }
      }
      st.push(current)
      current+=1
    }
    return ans
  }
}
