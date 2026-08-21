class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int max = 0;
        int ans = 0;
        for(int right = 0; right < s.length(); right++){
            int index = s.charAt(right) - 'A';
            count[index]++;

            max = Math.max(max, count[index]);
            int windowSize = right - left + 1;
            int replace = windowSize - max;

            if(replace > k){
                count[s.charAt(left) - 'A']--;
                left++;

                windowSize = right - left + 1;
                replace = windowSize - max;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}