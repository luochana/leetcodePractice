package list.SplitLinkedListInParts_725;

class ListNode {
   int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution_java {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode temp = root;
        int len = 0;
        while(temp != null){
            ++len;
            temp = temp.next;
        }
        int partsLen = len / k;
        int left = len % k;
        ListNode[] res = new ListNode[k];
        temp = root;
        if(partsLen < 1){
            int i = 0;
            while(temp != null){
                res[i] = temp;
                temp = temp.next;
                res[i].next = null;
                i++;
            }
            return res;
        }else{
            temp = root;
            ListNode temp1 = temp;
            for(int i = 0; i < k; ++i){
                res[i] = temp;
                for(int j = 0; j < (left <= 0 ? partsLen : partsLen + 1); ++j){
                    temp1 = temp;
                    temp = temp.next;
                }
                temp1.next = null;
                --left;
            }
            return res;
        }
    }
}
