package dfs.SumRootToLeafNumbers_129;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution_java {

    int res = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return res;
        dfs(root, "");
        return res;
    }
    public void dfs(TreeNode node, String tempSum){
        if(node.left == null && node.right == null){
            res += Integer.parseInt(tempSum + String.valueOf(node.val));
            return;
        }
        if(node.left != null)
            dfs(node.left, tempSum + String.valueOf(node.val));
        if(node.right != null)
            dfs(node.right, tempSum + String.valueOf(node.val));
    }

}
