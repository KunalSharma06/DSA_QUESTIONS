class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }

    static int atmost(int [] nums, int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while(right < nums.length){
            int val = nums[right];
            map.put(val, map.getOrDefault(val, 0) + 1);

            while(map.size() > k){
                int freq = map.get(nums[left]);
                freq--;
                if(freq == 0){
                    map.remove(nums[left]);
                }else{
                    map.put(nums[left], freq);
                }
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}