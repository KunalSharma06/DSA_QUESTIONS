class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int count = 1;
        int index = 0;
        nums[index++] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= k){
                nums[index++] = nums[i];
            }
        }

        int[] ans = new int[index];
        for(int i = 0; i < index; i++){
            ans[i] = nums[i];
        }
        return ans;
    }
}