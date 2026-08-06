class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        int i;
        for(i = n - 1; i > 0; i--){
            if(nums[i - 1] >= nums[i]){
                break;
            }
        }
        return i;
    }
}