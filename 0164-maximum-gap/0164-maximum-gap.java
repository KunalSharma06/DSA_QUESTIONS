class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return 0;
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            int diff = Math.abs(nums[i - 1] - nums[i]);
            max = Math.max(max, diff);
        }
        return max;
    }
}