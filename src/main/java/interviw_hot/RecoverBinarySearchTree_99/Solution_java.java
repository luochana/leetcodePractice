package interviw_hot.RecoverBinarySearchTree_99;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class Solution_java {
    TreeNode firstNode = null;
    TreeNode secondNode = null;
    TreeNode preNode = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {

        in_order(root);
        int tmp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = tmp;
    }

    private void in_order(TreeNode root) {
        if (root == null) return;
        in_order(root.left);
        if (firstNode == null && preNode.val > root.val) firstNode = preNode;
        if (firstNode != null && preNode.val > root.val) secondNode = root;
        preNode = root;
        in_order(root.right);
    }
}
