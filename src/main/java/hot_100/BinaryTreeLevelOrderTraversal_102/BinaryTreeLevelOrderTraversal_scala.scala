package hot_100.BinaryTreeLevelOrderTraversal_102

import java.util.{ArrayList, LinkedList, List, Queue}

class BinaryTreeLevelOrderTraversal_scala {

  def levelOrder(root: TreeNode): List[List[Integer]] = {
    val res = new ArrayList[List[Integer]]
    if (root == null) return res
    val queue = new LinkedList[TreeNode]
    queue.add(root)
    var level = 0
    while (!queue.isEmpty) { // start the current level
      res.add(new ArrayList[Integer])
      // number of elements in the current level
      val level_length = queue.size
      for(i <- 0 until( level_length)) {
        val node = queue.remove
        // fulfill the current level
        res.get(level).add(node.`val`)
        // add child nodes of the current level
        // in the queue for the next level
        if (node.left != null) queue.add(node.left)
        if (node.right != null) queue.add(node.right)
      }
      // go to next level
      level += 1
    }
    res
  }
}
