class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;
        int[] gain = new int[n];
        for(int i = 0; i < n; i++){
           sum += nums[i];
            char[] arr = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(arr);
            int max =0;
            for(int j = arr.length - 1; j >= 0; j--){
                max = max * 10 + (arr[j] - '0');
            }
            gain[i] = max - nums[i];
        }
        Arrays.sort(gain);
        for(int i = n - 1; i >= n - k; i--){
            sum += gain[i];
        }
        return sum;
    }
}