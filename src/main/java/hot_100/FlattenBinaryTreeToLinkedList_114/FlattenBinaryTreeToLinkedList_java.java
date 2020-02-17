package hot_100.FlattenBinaryTreeToLinkedList_114;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }


public class FlattenBinaryTreeToLinkedList_java {

    public void flatten(TreeNode root) {
        TreeNode temp;
        TreeNode tail;
        Stack<TreeNode> stack = new Stack<>();
        temp=root;
        tail=root;
        while (temp!=null){
            if(temp.right!=null)
                stack.push(temp.right);
            temp=temp.left;
            if(temp!=null) {
                tail.right = temp;
                tail.left=null;
                tail = temp;
            }
        }
        while (!stack.isEmpty()){
            temp=stack.pop();
            tail.right=temp;
            tail.left=null;
            tail=tail.right;
            while (temp!=null) {
                if (temp.right != null)
                    stack.push(temp.right);
                temp = temp.left;
                if (temp != null) {
                    tail.right = temp;
                    tail.left=null;
                    tail = temp;
                }
            }
        }
    }



    //m2
    //https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by--26/
    public void flatten1(TreeNode root){
        while(root != null){
            if(root.left ==null){
                root = root.right;
            }else {
                TreeNode pre = root.left;
                while(pre.right != null){
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root = root.right;
            }
        }
    }
}
