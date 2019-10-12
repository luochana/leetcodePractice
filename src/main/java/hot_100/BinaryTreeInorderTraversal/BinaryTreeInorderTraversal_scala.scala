package hot_100.BinaryTreeInorderTraversal


import java.util.{ArrayList, List, Stack}


//测试结果不正确,有空再看看
class BinaryTreeInorderTraversal_scala {

  def inorderTraversal(root: TreeNode): List[Int] = {
    val stack = new Stack[TreeNode]
    val list = new ArrayList[Int]
    if (root == null) return list
    var pointer = root
    while (pointer != null) {
      stack.push(pointer)
      pointer = pointer.left
    }
    while (!stack.isEmpty) {
      val node = stack.pop
      list.add(node.`val`)
      if (node.right != null) {
        pointer = node.right
        while (pointer != null) {
          stack.push(pointer)
          pointer = pointer.left
        }
      }
    }
    list
  }
}
