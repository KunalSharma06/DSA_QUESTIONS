class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int size = set.size();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            HashSet<Integer> actual = new HashSet<>();
            for(int j = i; j < nums.length; j++){
                actual.add(nums[j]);
                if(actual.size() == size){
                    ans++;
                }
            }
        }
        return ans;
    }
}