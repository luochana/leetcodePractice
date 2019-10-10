package hot_100.IsBinarySearchTree;

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class IsBinarySearchTree_java {


    //1.中序遍历
    private ArrayList<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        dfs(root);
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode node){
        if(node!=null){
            dfs(node.left);
            list.add(node.val);
            dfs(node.right);
        }
    }


    //递归

    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (! helper(node.right, val, upper)) return false;
        if (! helper(node.left, lower, val)) return false;
        return true;
    }

    public boolean isValidBST1(TreeNode root) {
        return helper(root, null, null);
    }

}
