class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        boolean[] valid = new boolean[n];
        valid[0] = valid[n - 1] = true;

        int max = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > max){
                valid[i] = true;
                max = nums[i];
            }
        }

        max = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] > max){
                valid[i] = true;
                max = nums[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(valid[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}