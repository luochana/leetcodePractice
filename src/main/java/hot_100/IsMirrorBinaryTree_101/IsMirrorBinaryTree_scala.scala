package hot_100.IsMirrorBinaryTree_101


import java.util.{LinkedList, Queue}

class IsMirrorBinaryTree_scala {
  //1.递归
  def isSymmetric(root: TreeNode): Boolean = isMirror(root, root)

  def isMirror(left: TreeNode, right: TreeNode): Boolean = {
    if (left == null && right == null) return true
    if (left == null || right == null) return false
    (left.`val` == right.`val`) && isMirror(left.left, right.right) && isMirror(left.right, right.left)
  }

  def isSymmetric1(root: TreeNode): Boolean = {
    val queue: Queue[TreeNode] = new LinkedList[TreeNode]
    queue.add(root)
    queue.add(root)
    while (!queue.isEmpty) {
      val t1: TreeNode = queue.poll
      val t2: TreeNode = queue.poll

      //t1,t2同时为null跳过下面操作
      if(!(t1==null&&t2==null)) {
        if (t1 == null || t2 == null) return false
        if (t1.`val` != t2.`val`) return false
        queue.add(t1.left)
        queue.add(t2.right)
        queue.add(t1.right)
        queue.add(t2.left)
      }
    }
    return true
  }
}
