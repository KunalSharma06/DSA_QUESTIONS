class Solution {
    public int minDeletions(int[] nums) {
        int ans = 0;
        int last = nums[0];
        for(int i = 1; i < nums.length; i++){
            if((nums[i] ^ last) == 0){
                ans++;
            }else{
                last = nums[i];
            }
        }
        return ans;
    }
}