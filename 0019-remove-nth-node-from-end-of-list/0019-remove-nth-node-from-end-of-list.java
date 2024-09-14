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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;

        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len == 1 && n==1){
            return null;
        }
        int ind = (len-n-1);
        
        temp = head;
        while(ind > 0){
            temp = temp.next;
            ind--;
        }
        temp.next = temp.next.next;
        return head;
    }
}