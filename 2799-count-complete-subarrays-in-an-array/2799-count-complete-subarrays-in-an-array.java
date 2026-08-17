class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // int size = set.size();
        // int ans = 0;
        // for(int i = 0; i < nums.length; i++){
        //     HashSet<Integer> actual = new HashSet<>();
        //     for(int j = i; j < nums.length; j++){
        //         actual.add(nums[j]);
        //         if(actual.size() == size){
        //             ans++;
        //         }
        //     }
        // }
        // return ans;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int size = set.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.size() == size){
                ans += nums.length - right;
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
        }
        return ans;
    }
}