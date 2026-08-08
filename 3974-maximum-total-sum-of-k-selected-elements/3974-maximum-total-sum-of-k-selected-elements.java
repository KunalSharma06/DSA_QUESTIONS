class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        int i = nums.length - 1;
        for(int count = 0; count < k; count++){
            if(mul > 1){
                sum += (long) nums[i] * mul;
            }else{
                sum += nums[i];
            }
            mul--;
            i--;
            
        }
        return sum;
    }
}