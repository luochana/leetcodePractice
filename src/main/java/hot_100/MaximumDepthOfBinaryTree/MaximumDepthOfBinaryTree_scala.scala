package hot_100.MaximumDepthOfBinaryTree

class MaximumDepthOfBinaryTree_scala {

  private var max = 0

  def maxDepth(root: TreeNode): Int = {
    if (root == null) return 0
    findMax(root, 1)
    max
  }

  def findMax(node: TreeNode, currentMax: Int): Unit = {
    if (node != null) {
      max = if (max > currentMax) max
      else currentMax
      findMax(node.left, currentMax + 1)
      findMax(node.right, currentMax + 1)
    }
  }
}
