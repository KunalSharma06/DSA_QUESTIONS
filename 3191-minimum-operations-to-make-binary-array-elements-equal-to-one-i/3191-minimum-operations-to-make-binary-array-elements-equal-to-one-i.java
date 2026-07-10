class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i = 0; i <= nums.length - 3; i++){
            if(nums[i] == 0){
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                ans++;
            }
        }
        for(int val : nums){
            if(val != 1){
                return -1;
            }
        }
        return ans;
    }
}