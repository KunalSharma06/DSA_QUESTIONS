class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            int diff = Math.abs(nums[i] - nums[i + 1]);
            max = Math.max(max, diff);
        }
        int diff = Math.abs(nums[n - 1] - nums[0]);
        max = Math.max(max, diff);
        return max;
    }
}