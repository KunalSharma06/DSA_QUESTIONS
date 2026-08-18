class Solution {
    public int longestBeautifulSubstring(String word) {
        int count = 1;
        int right = 1;
        int left = 0;
        int ans = 0;
        while(right < word.length()){
            if(word.charAt(right) == word.charAt(right - 1)){}
            else if(word.charAt(right) > word.charAt(right - 1)){
                count++;
            }else{
                left = right;
                count = 1;
            }

            if(count == 5){
                ans = Math.max(ans, right - left + 1);
            }
            right++;
        }
        return ans;
    }
}