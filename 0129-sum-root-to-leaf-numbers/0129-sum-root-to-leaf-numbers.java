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
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(root);
        st2.push(root.val);
        
        int sum = 0;

        while(!st1.isEmpty()){
            TreeNode node = st1.pop();
            int value = st2.pop();

            if(node.left == null && node.right == null){
                sum += value;
            }

            if(node.left != null){
                st1.push(node.left);
                st2.push(value * 10 + node.left.val);
            }

            if(node.right != null){
                st1.push(node.right);
                st2.push(value * 10 + node.right.val);
            }
        }

        return sum;
    }
}