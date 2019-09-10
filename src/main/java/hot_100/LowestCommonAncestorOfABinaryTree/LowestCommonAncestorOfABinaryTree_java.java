package hot_100.LowestCommonAncestorOfABinaryTree;

//后序遍历,写得略乱.效率超越93%

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class LowestCommonAncestorOfABinaryTree_java {
    private int p;
    private int q;
    private TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.p=p.val;
        this.q=q.val;
        dfs(root);
        return res;
    }

    public boolean dfs(TreeNode node)
    {
        if(res==null&&node!=null) {
            boolean Lflag = false;
            boolean Rflag = false;
            if (node.left != null)
                Lflag = dfs(node.left);
            if (node.right != null)
                Rflag = dfs(node.right);
            if (Lflag && Rflag)        //左右后代找到了target
                res=new TreeNode(node.val);
            if((Lflag||Rflag)&&(node.val==p||node.val==q))   //target之间是祖辈关系
                res=new TreeNode(node.val);
            if(node.val==p||node.val==q||Lflag||Rflag)
                return true;
        }
        return false;
    }
}
