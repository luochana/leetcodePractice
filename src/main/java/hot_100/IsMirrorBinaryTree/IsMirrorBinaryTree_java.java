package hot_100.IsMirrorBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class IsMirrorBinaryTree_java {

    //1.递归
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        if(left==null||right==null)
            return false;
        return (left.val==right.val)&&isMirror(left.left,right.right)&&isMirror(left.right,right.left);
    }

    //2.迭代
    public boolean isSymmetric1(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }

}
