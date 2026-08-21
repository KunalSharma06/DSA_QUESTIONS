class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < nums.length){
            while(nums[right] - nums[left] > 1){
                left++;
            }
            if(nums[right] - nums[left] == 1){
                max = Math.max(max, right - left + 1);
            }
            right++;
        }
        return max;
    }
}