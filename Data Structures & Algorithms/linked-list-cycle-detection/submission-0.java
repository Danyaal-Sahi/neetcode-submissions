/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> circ = new HashSet<>();
        ListNode curr = head;

        while(curr != null){

            if(circ.contains(curr)){
                return true;
            }
            circ.add(curr);
            curr = curr.next;
        }

        return false;
        
    }
}
