class Solution {
    public int integerReplacement(int n) {
        long val = n;
        int count = 0;
        while(val != 1){
            if(val % 2 == 0){ 
                val /= 2;
            }else{
                if(val == 3 || (val & 3) == 1){
                    val = val - 1;
                }else{
                    val = val + 1;
                }
            }
            count++;
        }
        return count;
    }
}