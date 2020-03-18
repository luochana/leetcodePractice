package hot_100.LowestCommonAncestorOfABinaryTree_236

class LowestCommonAncestorOfABinaryTree_scala {
  private var p = 0
  private var q = 0
  private var res:TreeNode = null

  def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
    this.p = p.`val`
    this.q = q.`val`
    dfs(root)
    res
  }

  def dfs(node: TreeNode): Boolean = {
    if (res == null && node != null) {
      var Lflag = false
      var Rflag = false
      if (node.left != null) Lflag = dfs(node.left)
      if (node.right != null) Rflag = dfs(node.right)
      if (Lflag && Rflag)
        res = new TreeNode(node.`val`)
      if ((Lflag || Rflag) && (node.`val` == p || node.`val` == q))
        res = new TreeNode(node.`val`)
      if (node.`val` == p || node.`val` == q || Lflag || Rflag)
        return true
    }
    false
  }
}
