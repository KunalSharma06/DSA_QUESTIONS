class Solution {
    public long sumAndMultiply(int n) {
        String str = "";
        String s = "" + n;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0'){
                str += s.charAt(i);
            }
        }
        if(str.isEmpty()) return 0;
        long ans = Long.parseLong(str);
        int sum = 0;
        long digit = ans;
        while(digit != 0){
            sum += digit % 10;
            digit /= 10;
        }
        return ans * sum;
    }
}