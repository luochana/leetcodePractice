package hot_100.HouseRobberIII;

//后序遍历,向前推进

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
public class HouseRobberIII_java {
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        postorder(root);
        return root.val;
    }

    public void postorder(TreeNode root){
        if (root.left!=null){
            postorder(root.left);
        }
        if (root.right!=null){
            postorder(root.right);
        }
        int res1=0;
        int res2=root.val;
        if (root.left!=null){
            res1=res1+root.left.val;
            if (root.left.left!=null){
                res2=res2+root.left.left.val;
            }
            if (root.left.right!=null){
                res2=res2+root.left.right.val;
            }
        }
        if (root.right!=null){
            res1=res1+root.right.val;
            if (root.right.left!=null){
                res2=res2+root.right.left.val;
            }
            if (root.right.right!=null){
                res2=res2+root.right.right.val;
            }
        }
        root.val=Math.max(res1, res2);
    }
}
