class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        sum += nums[nums.length - 1] + nums[nums.length - 2] - nums[0];
        return sum;
    }
}