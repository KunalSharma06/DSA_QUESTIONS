class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(largest != nums[i] && largest < 2 * nums[i]){
                return -1;
            }
        }
        if(maxIndex == Integer.MIN_VALUE) return -1;
        return maxIndex;
    }
}