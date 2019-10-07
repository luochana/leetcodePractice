package hot_100.MaximumDepthOfBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class MaximumDepthOfBinaryTree_java {
    private int max=0;
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        findMax(root,1);
        return max;
    }

    public void findMax(TreeNode node,int currentMax){
        if(node!=null){
            max=max>currentMax?max:currentMax;
            findMax(node.left,currentMax+1);
            findMax(node.right,currentMax+1);
        }
    }
}
