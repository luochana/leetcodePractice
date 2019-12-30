package bfs.FindLargestValueInEachTreeRow_515;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution_java {
    public List<Integer> largestValues(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        queue.add(root);
        while(!queue.isEmpty()){
            int temp = Integer.MIN_VALUE;
            int size = queue.size();
            for(int i = 0; i < size; ++i){
                TreeNode node = queue.removeFirst();
                if(node.val > temp){
                    temp = node.val;
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
