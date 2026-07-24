class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        // long sum = 0;
        // for(int i = 0; i < k; i++){
        //     sum += max - min;
        // }
        // return sum;
        return (max - min) * k;
    }
}