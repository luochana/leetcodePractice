package hot_100.BinaryTreeMaximumPathSum_124

class BinaryTreeMaximumPathSum_scala {
  private var max_sum = Integer.MIN_VALUE

  def max_gain(node: TreeNode): Int = {
    if (node == null) return 0
    // max sum on the left and right sub-trees of node
    val left_gain = Math.max(max_gain(node.left), 0)
    val right_gain = Math.max(max_gain(node.right), 0)
    // the price to start a new path where `node` is a highest node
    val price_newpath = node.`val` + left_gain + right_gain
    // update max_sum if it's better to start a new path
    max_sum = Math.max(max_sum, price_newpath)
    // for recursion :
    // return the max gain if continue the same path
    node.`val` + Math.max(left_gain, right_gain)
  }

  def maxPathSum(root: TreeNode): Int = {
    max_gain(root)
    max_sum
  }
}
