class Solution {
    public int longestSubarray(int[] nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            long sum = 0;
            HashSet<Long> set = new HashSet<>();
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                long val = (2L * nums[j]) % k;
                if(val < 0) val += k;
                
                set.add(val);

                long rem = sum % k;
                if(rem < 0) rem += k;
                if(rem == 0){
                    ans = Math.max(ans, j - i + 1);
                }else if(set.contains(rem)){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}