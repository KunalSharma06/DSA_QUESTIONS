class Solution {
    public boolean check(String s, int left1, int right1){
        while(left1 < right1){
            if(s.charAt(left1) != s.charAt(right1)){
               return false;
            }
            left1++;
            right1--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return check(s, left + 1, right) || check(s, left, right - 1);
            }
        }
        return true;
    }
}