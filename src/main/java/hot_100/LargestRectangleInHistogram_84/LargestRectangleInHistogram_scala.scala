package hot_100.LargestRectangleInHistogram_84

class LargestRectangleInHistogram_scala {

  def largestRectangleArea(heights: Array[Int]): Int = {
    var maxArea = 0
    var i = 0
    for (i <- 0 until(heights.length)) {
      var minHeight = Integer.MAX_VALUE
      for(j<-(0 to i).reverse) {
        minHeight = Math.min(minHeight, heights(j))
        maxArea = Math.max(maxArea, minHeight * (i - j + 1))
      }
    }
    maxArea
  }

}
