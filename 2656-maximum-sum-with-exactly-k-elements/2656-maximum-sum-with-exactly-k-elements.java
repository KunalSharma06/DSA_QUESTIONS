class Solution {
    public int maximizeSum(int[] nums, int k) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // int sum = 0;
        // while(k > 0){
        //     sum += nums[n - 1];
        //     int val = nums[n - 1];
        //     nums[n - 1] = val + 1;
        //     k--;
        // }
        // return sum;

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int i = 0; i < k; i++){
            sum += max;
            max++;
        }
        return sum;
    }
}