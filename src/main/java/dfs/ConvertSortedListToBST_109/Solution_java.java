package dfs.ConvertSortedListToBST_109;


import java.util.ArrayList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}



//因为有序,相对于中序遍历的结果，递归最好做了，但效率好像不太行，击败45%
public class Solution_java {
    ArrayList<Integer> list = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        return buildTree(0, list.size() - 1);
    }
    TreeNode buildTree(int left ,int right){
        if(left > right)
            return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = buildTree(left, mid - 1);
        node.right = buildTree(mid + 1, right);
        return node;
    }
}
