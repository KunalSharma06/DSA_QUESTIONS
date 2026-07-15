class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int count = 0;
        int max = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                sum--;
            }else{
                sum++;
            }
            if(map.containsKey(sum)){
                int index = map.get(sum);
                count = i - index;
                max = Math.max(max, count);
            }else{
                map.put(sum, i);
            }
        }
        return max;
    }
}