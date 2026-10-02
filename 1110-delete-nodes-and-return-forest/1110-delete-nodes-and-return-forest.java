class Solution {
    Set<Integer> set = new HashSet<>();
    List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int x : to_delete){
            set.add(x);
        }
        dfs(root, true);
        return list;
    }
    public TreeNode dfs(TreeNode root, boolean isRoot){
        if(root == null) return null;
        boolean deleted = set.contains(root.val);

        if(isRoot && !deleted){
            list.add(root);
        }
        root.left = dfs(root.left, deleted);
        root.right = dfs(root.right, deleted);

        if (deleted) {
            return null;
        }

        return root;
    }

}