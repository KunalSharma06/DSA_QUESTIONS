class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            map.putIfAbsent(sum, new PriorityQueue<>((a, b) -> b - a));
            PriorityQueue<Integer> pq = map.get(sum);
            pq.offer(nums[i]);
            if(pq.size() >= 2){
                int first = pq.poll();
                int second = pq.poll();
                ans = Math.max(ans, first + second);
                pq.offer(first);
                pq.offer(second);
            }
        }
        return ans;
    }
}