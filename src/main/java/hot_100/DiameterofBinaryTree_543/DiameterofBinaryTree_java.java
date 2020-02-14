package hot_100.DiameterofBinaryTree_543;


 class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class DiameterofBinaryTree_java {
    //设置一个类变量，用于记录最大直径
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        //max记录当前的最大直径
        max = Math.max(leftDepth + rightDepth, max);
        //由于我计算的直径是左树高度+右树高度，所以这里返回当前树的高度，以供使用
        return Math.max(leftDepth, rightDepth) + 1;
    }


    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t3.left=null;
        t3.right=null;
        t4.left=null;
        t4.right=null;
        t5.left=null;
        t5.right=null;
        DiameterofBinaryTree_java a=new DiameterofBinaryTree_java();
        System.out.println(a.diameterOfBinaryTree(t1));
    }

}
