class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // for(int i = 0; i < nums.length; i++){
        //     int max = nums[0];
        //     int min = nums[i];
        //     for(int j = 0; j <= i; j++){
        //         max = Math.max(max, nums[j]);
        //     }

        //      for(int j = i; j < nums.length; j++){
        //         min = Math.min(min, nums[j]);
        //     }
        //     if(max - min <= k){
        //         return i;
        //     }
        // }
        // return -1;

        int n = nums.length;

        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
        }

        int max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);

            if (max - min[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}