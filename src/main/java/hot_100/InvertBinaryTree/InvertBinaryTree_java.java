package hot_100.InvertBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

public class InvertBinaryTree_java {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        dfs(root);
        return root;
    }

    public void dfs(TreeNode node)
    {
        if(node!=null)
        {
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
        if(node.left!=null)
            dfs(node.left);
        if(node.right!=null)
            dfs(node.right);
    }
}
