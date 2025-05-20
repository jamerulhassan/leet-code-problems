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
    public ListNode deleteDuplicates(ListNode head) {
        removeDuplicates(head);
        return head;
    }
    static void removeDuplicates(ListNode currNode){
        if(currNode == null){
            return;
        }
        if(currNode.next == null){
            return;
        }

        while(currNode.val == currNode.next.val){
            currNode.next = currNode.next.next;
            if(currNode.next == null){
                break;
            }
        }
 /*        if(currNode.val == currNode.next.val){
            currNode.next = currNode.next.next;
        }

        if(currNode.val == currNode.next.val){

        } */
        removeDuplicates(currNode.next);
    }
}