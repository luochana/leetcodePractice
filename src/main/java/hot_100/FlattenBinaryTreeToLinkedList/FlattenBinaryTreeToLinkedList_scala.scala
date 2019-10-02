package hot_100.FlattenBinaryTreeToLinkedList


import java.util.Stack

class FlattenBinaryTreeToLinkedList_scala {

  def flatten(root: TreeNode): Unit = {
    var temp:TreeNode =null
    var tail:TreeNode=null
    val stack = new Stack[TreeNode]
    temp = root
    tail = root
    while (temp != null) {
      if (temp.right != null) stack.push(temp.right)
      temp = temp.left
      if (temp != null) {
        tail.right = temp
        tail.left = null
        tail = temp
      }
    }
    while (!stack.isEmpty) {
      temp = stack.pop
      tail.right = temp
      tail.left = null
      tail = tail.right
      while (temp != null) {
        if (temp.right != null)
          stack.push(temp.right)
        temp = temp.left
        if (temp != null) {
          tail.right = temp
          tail.left = null
          tail = temp
        }
      }
    }
  }
}
