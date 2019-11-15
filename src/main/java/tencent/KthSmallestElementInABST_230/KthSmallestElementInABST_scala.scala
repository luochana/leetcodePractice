package tencent.KthSmallestElementInABST_230

class KthSmallestElementInABST_scala {
  var i = 0
  var res = 0

  def kthSmallest(root: TreeNode, k: Int): Int = {
    process(root, k)
    res
  }

  def process(node: TreeNode, k: Int): Unit = {
    if (node.left != null) process(node.left, k)
    if ( {
      i += 1; i
    } == k) res = node.`val`
    if (node.right != null) process(node.right, k)
  }
}
