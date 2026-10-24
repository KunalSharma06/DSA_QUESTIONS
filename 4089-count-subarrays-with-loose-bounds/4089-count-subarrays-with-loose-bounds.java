class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        long length = 0;
        for(int num : nums){
            if(num >= minK && num <= maxK){
                length++;
            }else{
                length = 0;
            }
            count += length;
        }
        return count;
    }
}