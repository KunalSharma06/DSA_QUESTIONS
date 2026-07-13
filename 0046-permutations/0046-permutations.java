// class Solution {

//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         helper(nums, 0, ans);
//         return ans;
//     }
// }


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        recursion(lst,nums,new ArrayList<>());
        return lst;
    }
    public void recursion(List<List<Integer>> lst,int[] arr,List<Integer> temp){
        if(temp.size()==arr.length && !lst.contains(temp)){
            lst.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!temp.contains(arr[i])){
                temp.add(arr[i]);
                recursion(lst,arr,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}























// class Solution {
//     private void helper(int []nums, int idx, List<List<Integer>> ans){
//         int n = nums.length;
//         if(idx == n){
//         List<Integer> list = new ArrayList<>();
//            for(int num : nums){
//             list.add(num);
//            }
//             ans.add(list);
//             return;
//         }

//         for(int i = idx; i < n; i++){
//             swap(i, idx, nums);
//             helper(nums, idx + 1, ans);
//             swap(i, idx, nums);
//         }
//     }



//     public void swap(int i, int j, int[] nums){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         helper(nums, 0, ans);
//         return ans;
//     }
// }