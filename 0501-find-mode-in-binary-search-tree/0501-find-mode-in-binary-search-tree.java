class Solution {

    TreeNode prev = null;
    int count = 0;
    int maxCount = 0;
    List<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
       inorder(root);
       int [] arr = new int[list.size()];
       for(int i = 0; i < list.size(); i++){
        arr[i] = list.get(i);
       } 
       return arr;
    }
    
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);

        if(prev == null || prev.val != root.val){
            count = 1;
        }else{
            count++;
        }

        if(count > maxCount){
            maxCount = count;
            list.clear();
            list.add(root.val);
        }else if(count == maxCount){
            list.add(root.val);
        }
        prev = root;

        inorder(root.right);
    }
}