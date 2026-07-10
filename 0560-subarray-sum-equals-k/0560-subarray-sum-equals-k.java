class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            sum += num;
            int diff = sum - k;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        } 
        return count;  
    }
}