package hot_100.FlattenBinaryTreeToLinkedList;

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
}
