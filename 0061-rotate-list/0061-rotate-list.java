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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0) return head;
        int i = 1;
        //find the last node calculate length
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            i++;
        }
        temp.next = head;
        if(k == i) return head;
        int rotations = k % i;
        //find the node before sublist
        ListNode end = head;
        for(int j = 1; j < (i - rotations);j++){
            end = end.next;
        }
        ListNode newhead = end.next;
        end.next = null;
        return newhead;
    }
}