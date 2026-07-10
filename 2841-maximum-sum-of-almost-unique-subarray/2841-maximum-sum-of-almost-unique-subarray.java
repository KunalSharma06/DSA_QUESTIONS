class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int left = 0;
        int right = 0;
        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>(); 

        while(right < nums.size()){
            int val = nums.get(right);
            sum += val;
            map.put(val, map.getOrDefault(val, 0) + 1);

            if(right - left + 1 == k){
                if(map.size() >= m){
                    maxSum = Math.max(maxSum, sum);
                }

                sum -= nums.get(left);
                map.put(nums.get(left), map.getOrDefault(nums.get(left), 0) - 1);

                if(map.get(nums.get(left)) == 0){
                    map.remove(nums.get(left));
                }

                left++;
            } 
            right++;
        }
        return maxSum == Integer.MIN_VALUE ? 0 : maxSum;
    }
}