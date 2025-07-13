/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

/*
 * SEE BELOW SOLUTION FOR BETTER UNDESTANDING-
            https://leetcode.com/problems/delete-node-in-a-linked-list/solutions/5113435/beats-100-00-of-users-with-java-1-2-lines-solution-simple-well-explained-solution
 */

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //copied value of next node in node to be deleted.
        node.next = node.next.next; // moved the pointer to the next of next node and deleted the node after given node because we copied it's value to current node and moved the pointer of given node to next of value copied node.
    }
}
