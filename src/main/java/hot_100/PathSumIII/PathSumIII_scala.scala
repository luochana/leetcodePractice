package hot_100.PathSumIII

class PathSumIII_scala {

  def pathSum(root: TreeNode, sum: Int): Int = {
    if (root == null) return 0
    paths(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum)
  }

  private def paths(root: TreeNode, sum: Int): Int = {
    if (root == null) return 0
    var res = 0
    if (root.`val` == sum) res += 1
    res += paths(root.left, sum - root.`val`)
    res += paths(root.right, sum - root.`val`)
    res
  }
}
