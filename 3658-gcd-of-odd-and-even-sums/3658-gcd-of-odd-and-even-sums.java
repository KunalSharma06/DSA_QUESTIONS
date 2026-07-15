class Solution {
    public int gcdOfOddEvenSums(int n) {
        int eCount = 0, oCount = 0;
        int eSum = 0, oSum = 0;
        for(int i = 1; i <= n*n; i++){
            if(i % 2 == 0 && eCount != n){
                eSum += i;
                eCount++;
            }
            if(i % 2 != 0 && oCount != n){
                oSum += i;
                oCount++;
            }
        }
        while(eSum != 0){
            int temp = eSum;
            eSum = oSum % eSum;
            oSum = temp;
        }
        return oSum;
    }
}