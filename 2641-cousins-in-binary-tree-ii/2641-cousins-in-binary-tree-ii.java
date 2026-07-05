class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        root.val = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int levelSum = 0;

            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();

                if(curr.left != null){
                    levelSum += curr.left.val;
                }

                if(curr.right != null){
                    levelSum += curr.right.val;
                }
                q.add(curr);
            }

            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                int sum = 0;
                if(curr.left != null){
                    sum += curr.left.val;
                }
                if(curr.right != null){
                    sum += curr.right.val;
                }
                if(curr.left != null){
                    curr.left.val = levelSum - sum;
                    q.add(curr.left);
                }
                if(curr.right != null){
                    curr.right.val = levelSum - sum;
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
}