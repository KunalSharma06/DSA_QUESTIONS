class Solution {
    public int minSwaps(String s) {
        // int balance = 0;
        // int bad = 0;
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '['){
        //         balance++;
        //     }else{
        //         balance--;
        //     }
        //     if(balance < 0){
        //         bad = Math.max(bad, -balance);
        //     }
        // }
        // return (bad + 1) / 2;

        int swaps = 0;
        int open = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '['){
                open++;
            }
            else{
                open--;
                if(open < 0){
                    swaps++;
                    open = 1;
                }
            }
        }
        return swaps;
    }
}