package hot_100.ConvertBSTtoGreaterTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ConvertBSTtoGreaterTree_java {
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            dfs(root, 0);
        }
        return root;
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null) {
            return sum;
        }

        sum = dfs(node.right, sum);

        int nodeValue = node.val;
        node.val += sum;
        sum += nodeValue;

        sum = dfs(node.left, sum);
        return sum;
    }



    //解法二：
    private int sum = 0;

    public TreeNode convertBST1(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

}
