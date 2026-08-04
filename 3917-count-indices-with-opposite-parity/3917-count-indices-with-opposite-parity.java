class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < nums.length; i++){
            int val1 = nums[i];
            int score = 0;
            for(int j = i + 1; j < nums.length; j++){
                int val2 = nums[j];
                if(val1 % 2 == 0){
                    if(val2 % 2 != 0){
                        score++;
                    }
                }else{
                    if(val2 % 2 == 0){
                        score++;
                    }
                }
            }
            arr[i] = score;
        }
        return arr;
    }
}