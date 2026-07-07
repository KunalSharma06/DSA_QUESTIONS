class Solution {
    // public long sumAndMultiply(int n) {
    //     String str = "";
    //     String s = "" + n;
    //     for(int i = 0; i < s.length(); i++){
    //         if(s.charAt(i) != '0'){
    //             str += s.charAt(i);
    //         }
    //     }
    //     if(str.isEmpty()) return 0;
    //     long ans = Long.parseLong(str);
    //     int sum = 0;
    //     long digit = ans;
    //     while(digit != 0){
    //         sum += digit % 10;
    //         digit /= 10;
    //     }
    //     return ans * sum;
    // }

    long x = 0;
    long sum = 0;

    public long sumAndMultiply(long n) {
        x = 0;
        sum = 0;

        build(n);

        return x * sum;
    }

    public void build(long n) {
        if (n == 0) {
            return;
        }

        build(n / 10);

        long digit = n % 10;

        if (digit != 0) {
            x = x * 10 + digit;
            sum += digit;
        }
    }
}