class Solution {
    public int longestSubarray(int[] nums, int k) {
        int max = 0;
        for (int x : nums) {
            if (x > max) max = x;
        }
        int[] spf = new int[max + 1];

        for(int i = 2; i <= max; i++){
            if(spf[i] == 0){
                for(int j = i; j <= max; j += i){
                    if(spf[j] == 0){
                        spf[j] = i;
                    }
                }
            }
        }

        int[] freq = new int[max + 1];
        int left = 0;
        int distinct = 0;
        int ans = 0;
        for(int right = 0; right < nums.length; right++){
            int x = nums[right];
            while(x > 1){
                int p = spf[x];
                if(freq[p] == 0){
                    distinct++;
                }
                freq[p]++;
                while(x % p == 0){
                    x /= p;
                }
            }

            while(distinct > k){
                int x2 = nums[left];
                while(x2 > 1){
                    int p = spf[x2];
                    freq[p]--;

                    if(freq[p] == 0){
                        distinct--;
                    }
                    while(x2 % p == 0){
                        x2 /= p;
                    }
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}