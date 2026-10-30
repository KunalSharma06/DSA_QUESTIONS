class Solution {
    public String compressedString(String word) {
        String ans = "";
        int n = word.length();
        int i = 0;
        while(i < n){
            int count = 0;
            char ch = word.charAt(i);
            while(i < n && word.charAt(i) == ch && count < 9){
                count++;
                i++;
            }
            ans += count;
            ans += ch;
        }
        return ans;
    }
}