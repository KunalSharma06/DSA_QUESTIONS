class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 2;
        while(right < nums.length){
            if(nums[right] - nums[right - 1] == nums[right - 1] - nums[right - 2]){
                count += right - left - 1;
            }else{
                left = right - 1;
            }
            right++;
        }
        return count;
    }
}