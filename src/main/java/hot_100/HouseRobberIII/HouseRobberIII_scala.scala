package hot_100.HouseRobberIII

class HouseRobberIII_scala {
  def rob(root: TreeNode): Int = {
    if (root == null) return 0
    postorder(root)
    root.`val`
  }
  def postorder(root: TreeNode): Unit = {
    if (root.left != null) postorder(root.left)
    if (root.right != null) postorder(root.right)
    var res1 = 0
    var res2 = root.`val`
    if (root.left != null) {
      res1 = res1 + root.left.`val`
      if (root.left.left != null) res2 = res2 + root.left.left.`val`
      if (root.left.right != null) res2 = res2 + root.left.right.`val`
    }
    if (root.right != null) {
      res1 = res1 + root.right.`val`
      if (root.right.left != null) res2 = res2 + root.right.left.`val`
      if (root.right.right != null) res2 = res2 + root.right.right.`val`
    }
    root.`val` = Math.max(res1, res2)
  }
}
