package dfs.MinimumDepthOfBinaryTree_111;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }


public class Solution_java {
    int res = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        dfs(root, 0);
        return res;
    }

    public void dfs(TreeNode node, int length){
        if(node.left == null && node.right == null){
            res = Math.min(res, length + 1);
            return;
        }
        if(node.left != null){
            dfs(node.left, length + 1);
        }
        if(node.right != null){
            dfs(node.right, length + 1);
        }
    }
}
