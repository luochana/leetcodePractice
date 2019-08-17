package hot_100.DiameterofBinaryTree

//提交提示输入为空时,运行输出为3.但本地测试输出为0
object DiameterofBinaryTree_scala {
  private var max = 0

  def diameterOfBinaryTree(root: TreeNode): Int = {
    depth(root)
    max
  }

  private def depth(root: TreeNode): Int = {
    if (root==null)
      return 0
    val leftDepth = depth(root.left)
    val rightDepth = depth(root.right)
    //max记录当前的最大直径
    max = Math.max(leftDepth + rightDepth, max)
    //由于我计算的直径是左树高度+右树高度，所以这里返回当前树的高度，以供使用
    Math.max(leftDepth, rightDepth) + 1
  }

  def main(args: Array[String]):Unit={
    println(diameterOfBinaryTree(new TreeNode(1)))
    println(diameterOfBinaryTree(null))
  }
}
