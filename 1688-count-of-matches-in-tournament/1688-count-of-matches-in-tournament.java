class Solution {
    public int numberOfMatches(int n) {
        int sum = 0;
        while(n != 1){
            if(n % 2 == 0){
                int num =  n / 2;
                sum += num;
                n = num;
            }else{
                int num = (n - 1) / 2;
                sum += num;
                n = num + 1;
            }
        }
        return sum;
    }
}