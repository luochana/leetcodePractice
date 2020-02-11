package hot_100.BinaryTreeInorderTraversal_94;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreeInorderTraversal_java {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        TreeNode pointer=root;
        while (pointer!=null){
            stack.push(pointer);
            pointer=pointer.left;
        }

        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(node.val);
            if(node.right!=null){
                pointer=node.right;
                while (pointer!=null){
                    stack.push(pointer);
                    pointer=pointer.left;
                }
            }
        }
        return list;
    }
}
