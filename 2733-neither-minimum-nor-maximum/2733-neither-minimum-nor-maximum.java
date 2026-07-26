class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            } 
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max && nums[i] != min){
                ans = nums[i];
                break;
            }
        }
        if(ans == 0) return -1;
        return ans;
    }
}