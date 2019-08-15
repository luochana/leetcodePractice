package hot_100.MergeTwoBinaryTrees

class MergeTwoBinaryTrees_scala {
  def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
    if (t1 == null) return t2
    if (t2 == null) return t1
    val result = new TreeNode(t1.`val` + t2.`val`)
    result.left = mergeTrees(t1.left, t2.left)
    result.right = mergeTrees(t1.right, t2.right)
    result
  }
}
