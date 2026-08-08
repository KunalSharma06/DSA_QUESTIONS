class Solution {
    public int[] transformArray(int[] nums) {
        // int[] arr = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] % 2 == 0){
        //         arr[i] = 0;
        //     }else{
        //         arr[i] = 1;
        //     }
        // }
        // Arrays.sort(arr);
        // return arr;

        int even = 0;
        int odd = 0;
        for(int num : nums){
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(even != 0){
                nums[i] = 0;
                even--;
            }else{
                nums[i] = 1;
                odd--;
            }
        }
        return nums;
    }
}