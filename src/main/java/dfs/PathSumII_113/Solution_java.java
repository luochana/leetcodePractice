package dfs.PathSumII_113;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution_java {
    List<List<Integer>> res = new ArrayList<>();
    int sum1 = 0;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null)
            return res;
        sum1 = sum;
        dfs(new ArrayList<Integer>(), root, 0);
        return res;
    }
    public void dfs(ArrayList<Integer> arr, TreeNode node, int tempSum){
        if(node.left == null && node.right == null && (tempSum + node.val == sum1)){
            arr.add(node.val);
            res.add(arr);
        }
        if(node.left != null){
            ArrayList<Integer> temp = new ArrayList<Integer>(arr);
            temp.add(node.val);
            dfs(temp, node.left, tempSum + node.val);
        }
        if(node.right != null){
            ArrayList<Integer> temp1 = new ArrayList<Integer>(arr);
            temp1.add(node.val);
            dfs(temp1, node.right, tempSum + node.val);
        }
    }
}
