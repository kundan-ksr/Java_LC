/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
//  */


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head, curr = head.next;

        while (curr!=null) {
            if(slow.val == curr.val){
                slow.next = curr.next;
            }
            else {
                slow = slow.next;
            }
                curr = curr.next;
        }
        return head;
    }
}