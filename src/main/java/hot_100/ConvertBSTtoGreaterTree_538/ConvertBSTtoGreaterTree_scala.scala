package hot_100.ConvertBSTtoGreaterTree_538

//本地运行结果正确,线上测试不正确

object ConvertBSTtoGreaterTree_scala {

  def convertBST(root: TreeNode): TreeNode = {
    if (root != null) dfs(root, 0)
    root
  }

  private def dfs(node: TreeNode, sum: Int): Int = {
    if (node == null) return sum
    var tempSum=sum
    tempSum = dfs(node.right, tempSum)
    val nodeValue = node.`val`
    node.`val` += tempSum
    tempSum += nodeValue
    tempSum = dfs(node.left, tempSum)
    tempSum
  }
  def main(args: Array[String]):Unit={
    val t1 = new TreeNode(5)
    val t2 = new TreeNode(2)
    val t3 = new TreeNode(13)

    t1.left = t2
    t1.right = t3
    t2.left = null
    t2.right = null
    t3.left = null
    t3.right = null
    convertBST(t1)
    println(t2.`val`)
  }
}
