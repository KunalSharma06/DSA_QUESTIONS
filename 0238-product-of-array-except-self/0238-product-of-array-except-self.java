class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int prod = 1;
        // int [] arr = new int[nums.length];
        // arr[0] = 1;
        // for(int i = 1; i < nums.length; i++){
        //     arr[i] = arr[i - 1] * nums[i - 1]; 
        // }

        // int rightP = 1;
        // for(int i = nums.length - 1; i >= 0; i--){
        //     arr[i] = arr[i] * rightP;
        //     rightP = rightP * nums[i];
        // }
        // return arr;

        int n = nums.length;
        int[] ans = new int[n];
        int left = 1;

        for(int i=0;i<n;i++){
            ans[i]=left;
            left*=nums[i];
        }

        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=right;
            right*=nums[i];
        }

        return ans;

    }
}