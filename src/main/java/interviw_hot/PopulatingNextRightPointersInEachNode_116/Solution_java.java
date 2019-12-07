package interviw_hot.PopulatingNextRightPointersInEachNode_116;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class Solution_java {
    public Node connect(Node root) {
        if(root == null)
            return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node temp = queue.poll();
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
            for(int i = 1; i < size; ++i){
                Node curr = queue.poll();
                temp.next = curr;
                temp = temp.next;
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
            temp.next = null;
        }
        return root;
    }


    //m2
    public Node connect1(Node root) {
        Node pre = root;
        while (pre != null) {
            Node cur = pre;
            while (cur != null) {
                if (cur.left != null)
                    cur.left.next = cur.right;
                if (cur.right != null && cur.next != null)
                    cur.right.next = cur.next.left;
                cur = cur.next;
            }
            pre = pre.left;
        }
        return root;
    }


    //递归
    public Node connect2(Node root) {
        if(root == null){
            return null;
        }
        Node cur = root;
        while (cur != null) {
            if (cur.left != null) {
                cur.left.next = cur.right;
            }
            if (cur.right != null && cur.next != null) {
                cur.right.next = cur.next.left;
            }
            cur = cur.next;
        }
        connect(root.left);
        return root;
    }

}
