package hot_100.RotateImage

class RotateImage_scala {

  def rotate(matrix: Array[Array[Int]]): Unit = {
    val n = matrix.length
    for (i <- 0 until(n)){
      for(j <-  i until(n)){
        val tmp = matrix(j)(i)
        matrix(j)(i) = matrix(i)(j)
        matrix(i)(j) = tmp
      }
    }

    for (i <- 0 until(n)){
      for(j <-  0 until(n/2)) {
        val tmp = matrix(i)(j)
        matrix(i)(j) = matrix(i)(n - j - 1)
        matrix(i)(n - j - 1) = tmp
      }
    }
  }
}
