class Solution {
    public int minimumChairs(String s) {
        int max = Integer.MIN_VALUE;
        int wR = 0;
        int aC = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'E'){
                wR++;
            }else{
                wR--;
            }
            max = Math.max(max, wR);
        }
        return max;
    }
}