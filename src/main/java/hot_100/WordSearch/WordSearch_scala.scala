package hot_100.WordSearch

class WordSearch_scala {
  private var marked:Array[Array[Boolean]] = null

  //        x-1,y
  // x,y-1  x,y    x,y+1
  //        x+1,y
  private val direction = Array(Array(-1, 0), Array(0, -1), Array(0, 1), Array(1, 0))
  // 盘面上有多少行
  private var m = 0
  // 盘面上有多少列
  private var n = 0
  private var word:String = null
  private var board:Array[Array[Char]] = null

  def exist(board: Array[Array[Char]], word: String): Boolean = {
    m = board.length
    if (m == 0) return false
    n = board(0).length
    marked = Array.ofDim[Boolean](m,n)
    this.word = word
    this.board = board

    for (i <- 0 until m) {
      for (j <- 0 until n) {
        if (dfs(i, j, 0))
          return true
      }
    }
    false
  }

   def dfs(i: Int, j: Int, start: Int): Boolean = {
    if (start == word.length - 1) return board(i)(j) == word.charAt(start)
    if (board(i)(j) == word.charAt(start)) {
      marked(i)(j) = true
      var k = 0
      for (k <- 0 until 4) {
        val newX = i + direction(k)(0)
        val newY = j + direction(k)(1)
        if (inArea(newX, newY) && !marked(newX)(newY)) if (dfs(newX, newY, start + 1)) return true
      }
      marked(i)(j) = false
    }
    false
  }

   def inArea(x: Int, y: Int) = x >= 0 && x < m && y >= 0 && y < n
}
