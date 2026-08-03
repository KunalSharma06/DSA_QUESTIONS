class Solution {
    public int minimumSwaps(int[] nums) {
        int zero = 0;
        for(int num : nums){
            if(num == 0){
                zero++;
            }
        }

        int zeroAlready = 0;
        for(int i = nums.length - zero; i < nums.length; i++){
            if(nums[i] == 0){
                zeroAlready++;
            }
        }
        return zero - zeroAlready;
    }
}