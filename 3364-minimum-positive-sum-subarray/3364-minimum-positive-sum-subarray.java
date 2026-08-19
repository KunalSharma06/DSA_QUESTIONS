class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minS = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++){
            int sum = 0;
            int size = 0;
            for(int j = i; j < nums.size(); j++){
                sum += nums.get(j);

                size = j - i + 1;
                if(sum > 0 && size >= l && size <= r){
                    minS = Math.min(minS, sum);
                }

                if(size == r) break;
            }
        }
        if(minS == Integer.MAX_VALUE){
            return -1;
        }
        return minS;
    }
}