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
    long min = Long.MAX_VALUE;
    long min2 = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        if(min2 == Long.MAX_VALUE){
            return -1;
        }
        return (int) min2;
    }

    private void dfs(TreeNode root){
         if(root == null){
            return;
        }
        if(root.val < min){
            min2 = min;
            min = root.val;
        }
        else if(root.val > min && root.val < min2){
            min2 = root.val;
        }

        if(root.left != null) dfs(root.left);
        if(root.right != null) dfs(root.right);
    }
}