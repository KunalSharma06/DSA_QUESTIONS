class Solution {
    public int minRotations(String s) {
        int current = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int target = s.charAt(i) - '0';
            int diff = Math.abs(current - target);
            ans += Math.min(diff, 10 - diff);
            current = target;
        }
        return ans;
    }
}