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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrder(root, ans);
        return ans;
    }

    public void levelOrder(TreeNode root, List<List<Integer>> ans){
           
        Queue<TreeNode> q = new LinkedList<>();
        Boolean isAlternate = false;

        if(root == null){
            return;
        }
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode node = q.poll();

                level.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            if(isAlternate){
                    Collections.reverse(level);
                }
                isAlternate = !isAlternate;
            ans.add(level);
        }
        return;
    }

}