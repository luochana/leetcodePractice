package tencent.LowestCommonAncestorOfBST_235;

import java.util.HashSet;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
   TreeNode(int x) { val = x; }
 }

public class LowestCommonAncestorOfBST_java {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode res = null;
        TreeNode temp=root;
        HashSet<TreeNode> treeNodes = new HashSet<>();
        while (temp!=null&&temp!=p){
            treeNodes.add(temp);
            if(temp.val>p.val)
                temp=temp.left;
            else
                temp=temp.right;
        }
        if(temp!=null)
            treeNodes.add(temp);
        temp=root;
        while (temp!=null&&temp!=q){
            if(treeNodes.contains(temp)){
                res=temp;
            }
            if(temp.val>q.val)
                temp=temp.left;
            else
                temp=temp.right;
        }
        if(temp!=null&&treeNodes.contains(temp)){
            res=temp;
        }
        return res;
    }
}
