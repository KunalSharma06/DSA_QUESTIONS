class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE;
        int left = 0;
        int right = 1;
        int sum = nums[0];
        while(right <= nums.length){
            while(sum < target && right < nums.length){
                sum += nums[right];
                right++;
            }
            while(sum >= target){
                count = Math.min(count, right - left);
                sum -= nums[left];
                left++;
            }
            if(right == nums.length && sum < target){
                break;
            }
        }
        return count == Integer.MAX_VALUE ? 0 : count;
    }
}