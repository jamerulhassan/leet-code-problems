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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode dummy =new ListNode();
        ListNode tail = dummy;
        ListNode pres = head;
        while(pres != null){
            if(pres.val != val){
                tail.next = pres;
                pres = pres.next;
                tail = tail.next;
            }else{
                pres = pres.next;
            }
        }
        tail.next = pres;
        return dummy.next;
    }
}