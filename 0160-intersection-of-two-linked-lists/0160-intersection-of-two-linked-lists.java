/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode outer = headA;
        while(outer != null){
            ListNode inner = headB;
            while(inner != null){
                if(outer == inner){
                    return inner;
                }
                inner = inner.next;
            }
            outer = outer.next;
        }
        return null;
    }
}