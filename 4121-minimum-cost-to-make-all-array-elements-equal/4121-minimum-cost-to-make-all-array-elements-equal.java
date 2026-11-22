
class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        int i = nums[0] == nums[1] ? 0 : 1;
        long cost = Long.MAX_VALUE;
        while (i < n - 1) {
            int j = i + 1;

            while (j < n && nums[i] == nums[j]) {
                j++;
            }
            long curr = (i * 1L * nums[i]) + ((n - j) * 1L * nums[i]);
            cost = Math.min(cost, curr);
            i = j;
        }

        return cost;
    }
}
