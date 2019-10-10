package hot_100.IsBinarySearchTree

import java.util.ArrayList

//提交的错误用例,本地测试能通过,玄学.

object IsBinarySearchTree_scala {

  private val list = new ArrayList[Integer]

  def isValidBST(root: TreeNode): Boolean = {
    if (root == null) return true
    dfs(root)
    if(list.size()==1)
      return true;
    for(i <- 0 until(list.size - 1)) {
      if (list.get(i) >= list.get(i + 1))
        return false
    }
    true
  }

  def dfs(node: TreeNode): Unit = {
    if (node != null) {
      dfs(node.left)
      list.add(node.`val`)
      dfs(node.right)
    }
  }

  def main(args: Array[String]): Unit = {
    var a=new TreeNode(0);
    println(isValidBST(a));
  }

}
