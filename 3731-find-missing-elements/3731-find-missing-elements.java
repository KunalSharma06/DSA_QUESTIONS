class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[max + 1];

        for(int num : nums){
            flag[num] = true;
        }

        for(int i = min; i < max; i++){
            if(!flag[i]){
                list.add(i);
            }
        }
        return list;
    }
}