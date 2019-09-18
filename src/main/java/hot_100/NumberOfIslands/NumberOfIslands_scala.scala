package hot_100.NumberOfIslands

//和java一样的写法,莫名其妙的又提交出错...玄学
class NumberOfIslands_scala {
  var res = 0
  def numIslands(grid: Array[Array[Char]]): Int = {
    val colNum = grid.length
    if (colNum == 0) return 0
    val rowNum = grid(0).length
    if (rowNum == 0) return 0
    val flags = Array.ofDim[Int](colNum, rowNum)
    for(i <- 0 until(colNum)) {
      for (j <-0 until(rowNum)) {
        if (dfs(i, j, grid, flags))
          res += 1
      }
    }
    res
  }

  def dfs(col: Int, row: Int, grid: Array[Array[Char]], flags: Array[Array[Int]]): Boolean = {
    if (flags(col)(row) == 1 || grid(col)(row) == '0')
      return false
    flags(col)(row) = 1
    if (col - 1 >= 0 && flags(col - 1)(row) == 0 && grid(col - 1)(row) == '1')
      dfs(col - 1, row, grid, flags)
    if (col + 1 < grid.length && flags(col + 1)(row) == 0 && grid(col + 1)(row) == '1')
      dfs(col + 1, row, grid, flags)
    if (row - 1 >= 0 && flags(col)(row - 1) == 0 && grid(col)(row - 1) == '1')
      dfs(col, row - 1, grid, flags)
    if (row + 1 < grid(0).length && flags(col)(row + 1) == 0 && grid(col)(row + 1) == '1')
      dfs(col, row + 1, grid, flags)
    true
  }
}
