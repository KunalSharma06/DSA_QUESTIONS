class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for(int i = 0; i < nums.length; i++){
            pq.offer(new int[]{nums[i], i});
        }

        boolean[] arr = new boolean[nums.length];
        long sum = 0;

        while(!pq.isEmpty()){
            int[] p = pq.poll();
            int value = p[0];
            int index = p[1];
            if(arr[index]){
                continue;
            }
            sum += value;

            arr[index] = true;
            if(index > 0){
                arr[index - 1] = true;
            }
            if(index < nums.length - 1){
                arr[index + 1] = true;
            }
        }
        return sum;
    }
}