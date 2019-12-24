package dfs.BinaryTreeRightSideView_199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }


public class Sulotion_java {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; ++i){
                TreeNode temp = queue.poll();
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right !=null)
                    queue.add(temp.right);
                if(i == size - 1)
                    res.add(temp.val);
            }
        }
        return res;
    }
}
