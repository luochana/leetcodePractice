package hot_100.InvertBinaryTree

class InvertBinaryTree_scala {
  def invertTree(root: TreeNode): TreeNode = {
    if (root == null)
      return root
    dfs(root)
    root
  }

  def dfs(node: TreeNode): Unit = {
    if (node != null) {
      val temp = node.left
      node.left = node.right
      node.right = temp
    }
    if (node.left != null)
      dfs(node.left)
    if (node.right != null)
      dfs(node.right)
  }
}
