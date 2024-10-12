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
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Compute the length of the list
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        // Make the list circular
        temp.next = head;

        // Find the new head after the rotation
        k = k % len;  // Handle cases where k is larger than the list length
        int stepsToNewHead = len - k;

        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;  // Break the circular link

        return newHead;
    }
}
