package interviw_hot.PopulatingNextRightPointersInEachNodeII_117;


// Definition for a Node.
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
        Node cur = root;
        while (cur != null){
            Node eachLineHead = new Node();
            Node tail = eachLineHead;
            while (cur !=null){
                if(cur.left != null){
                    tail.next = cur.left;
                    tail = tail.next;
                }
                if (cur.right != null) {
                    tail.next = cur.right;
                    tail = tail.next;
                }
                cur = cur.next;
            }

            cur = eachLineHead.next;
        }
        return root;
    }
}
