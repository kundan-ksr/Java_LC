/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         List<Character> ans = new ArrayList<>();
//         List<Character> ans2 = new ArrayList<>();
//         inorder(p, ans);
//         inorder(q, ans2);
//         return ans.equals(ans2);
//     }

//     public void inorder(TreeNode node, List<Character> ans) {
//         if (node == null) {
//             ans.add('n');
//             return;
//         }

//         inorder(node.left, ans);
//         ans.add((char)node.val);
//         inorder(node.right, ans);

//     }
// }

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: if both trees are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        // If only one tree is null or the values are different, they are not identical
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // Recursively check if the left and right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}