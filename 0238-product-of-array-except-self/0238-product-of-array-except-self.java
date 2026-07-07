class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int [] arr = new int[nums.length];
        arr[0] = 1;
        for(int i = 1; i < nums.length; i++){
            arr[i] = arr[i - 1] * nums[i - 1]; 
        }

        int rightP = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            arr[i] = arr[i] * rightP;
            rightP = rightP * nums[i];
        }
        return arr;
    }
}