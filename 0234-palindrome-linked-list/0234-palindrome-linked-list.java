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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode mid = getMid(head);
        ListNode secondhead = reverseList(mid);
        ListNode temp1 = head;
        ListNode temp2 = secondhead;
        while (temp1 != mid && temp2 != null){
           if(temp1.val != temp2.val) return  false;
           temp1 = temp1.next;
           temp2 = temp2.next;
        }
        return true;
        
    }
    public ListNode getMid(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; // This is the middle node
}
    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}