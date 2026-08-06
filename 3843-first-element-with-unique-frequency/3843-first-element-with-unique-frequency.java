class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int x : map.values()){
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for(int num : nums){
            int f = map.get(num);
            if(map2.get(f) == 1){
                return num;
            }
        }
        return -1;
    }
}