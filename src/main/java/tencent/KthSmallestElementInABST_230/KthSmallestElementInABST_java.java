package tencent.KthSmallestElementInABST_230;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

 public class KthSmallestElementInABST_java {

    public int i=0;
    public int res=0;
    public int kthSmallest(TreeNode root, int k) {
        process(root,k);
        return res;
    }

    public void process(TreeNode node,int k){
        if(node.left!=null)
            process(node.left,k);
        if(++i==k){
            res=node.val;
        }
        if(node.right!=null){
            process(node.right,k);
        }
    }
}
