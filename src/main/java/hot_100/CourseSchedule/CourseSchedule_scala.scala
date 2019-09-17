package hot_100.CourseSchedule

class CourseSchedule_scala {
  def canFinish(numCourses: Int, prerequisites: Array[Array[Int]]): Boolean = {
    val adjacency = Array.ofDim[Int](numCourses,numCourses)
    val flags = new Array[Int](numCourses)
    for (cp <- prerequisites) {
      adjacency(cp(1))(cp(0)) = 1
    }
    for (i <- 0 until(numCourses)) {
      if (!dfs(adjacency, flags, i))
        return false
    }
    true
  }

  private def dfs(adjacency: Array[Array[Int]], flags: Array[Int], i: Int): Boolean = {
    if (flags(i) == 1) return false
    if (flags(i) == -1) return true
    flags(i) = 1
    for (j <- 0 until(adjacency.length)) {
      if (adjacency(i)(j) == 1 && !dfs(adjacency, flags, j))
        return false
    }
    flags(i) = -1
    true
  }
}
