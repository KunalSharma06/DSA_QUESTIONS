class Solution {
    public int firstUniqueEven(int[] nums) {
        // int count = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // int value = -1;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] % 2 == 0 && map.get(nums[i]) == 1){
        //         value = nums[i];
        //         break;
        //     }
        // }
        // return value;

        int[] arr = new int[200];
        for(int num : nums){
            if(num % 2 == 0){
                arr[num]++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(arr[nums[i]] == 1 && nums[i] % 2 == 0){
                return nums[i];
            }
        }
        return -1;
    }
}