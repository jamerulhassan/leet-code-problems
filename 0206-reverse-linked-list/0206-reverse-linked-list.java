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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode prv = null;
        ListNode pres = head;
        ListNode nxt = pres.next;

        while(pres != null){
            pres.next = prv;
            prv = pres;
            pres = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
        }
        return prv;
    }
}