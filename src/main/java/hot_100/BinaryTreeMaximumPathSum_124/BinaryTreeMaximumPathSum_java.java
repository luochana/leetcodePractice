package hot_100.BinaryTreeMaximumPathSum_124;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class BinaryTreeMaximumPathSum_java {

    //理解错题意了,注意是路径不是子树
/*    int max=Integer.MIN_VALUE;
    int tempMax=0;
    public int maxPathSum(TreeNode root) {
        SequentialTraversal(root);
        return max;
    }

    public void SequentialTraversal(TreeNode node){
        if(node.left!=null)
            SequentialTraversal(node.left);

        if(node.right!=null)
            SequentialTraversal(node.right);

        if(tempMax>0)
            tempMax+=node.val;
        else
            tempMax=node.val;
        max=Math.max(max,tempMax);
    }*/

    int max_sum = Integer.MIN_VALUE;

    public int max_gain(TreeNode node) {
        if (node == null)
            return 0;

        // max sum on the left and right sub-trees of node
        int left_gain = Math.max(max_gain(node.left), 0);
        int right_gain = Math.max(max_gain(node.right), 0);

        // the price to start a new path where `node` is a highest node
        int price_newpath = node.val + left_gain + right_gain;

        // update max_sum if it's better to start a new path
        max_sum = Math.max(max_sum, price_newpath);

        // for recursion :
        // return the max gain if continue the same path
        return node.val + Math.max(left_gain, right_gain);
    }

    public int maxPathSum(TreeNode root) {
        max_gain(root);
        return max_sum;
    }
}
