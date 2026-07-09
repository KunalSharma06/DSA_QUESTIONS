class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(ch);
                int len = right - left + 1;
                max = Math.max(max, len);
                right++;
            }
        }
        return max;
    }
}