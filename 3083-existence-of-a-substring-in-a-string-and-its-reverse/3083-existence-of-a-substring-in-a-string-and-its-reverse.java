class Solution {
    public boolean isSubstringPresent(String s) {
        int n = s.length();
        for(int i = 0; i < n - 1; i++){
            String pair = s.substring(i, i + 2);
            String reverse = pair.charAt(1) + "" + pair.charAt(0);
            if(s.contains(reverse)){
                return true;
            }
        }
        return false;
    }
}