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
    public ListNode middleNode(ListNode head) {
        // finding length
        ListNode ptr = head;
        int length = 0;
        while(ptr != null){
            ptr = ptr.next;
            length++;
        }

        // moving ptr to the middle
        ptr = head;
        int mid = length / 2;
        while(mid > 0){
            ptr = ptr.next;
            mid--;
        }

        return ptr;
    }
}