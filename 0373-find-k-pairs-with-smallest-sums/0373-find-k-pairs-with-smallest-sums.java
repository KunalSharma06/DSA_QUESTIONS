class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // List<List<Integer>> ans = new ArrayList<>();
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1]));
        // for(int i = 0; i < nums1.length; i++){
        //     for(int j = 0; j < nums2.length; j++){
        //         pq.add(new int[]{nums1[i], nums2[j]});
        //     }
        // }
        // while(k > 0 && !pq.isEmpty()){
        //     int[] pair = pq.poll();
        //     ans.add(Arrays.asList(pair[0], pair[1]));
        //     k--;
        // }
        // return ans;

        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(nums1[a[0]] + nums2[a[1]], nums1[b[0]] + nums2[b[1]]));
        for(int i = 0; i < Math.min(nums1.length, k); i++){
            pq.add(new int[]{i, 0});
        }
        while(k > 0 && !pq.isEmpty()){
            int[] pair = pq.poll();
            int i = pair[0];
            int j = pair[1];
            ans.add(Arrays.asList(nums1[i], nums2[j]));

            if(j + 1 < nums2.length){
                pq.add(new int[]{i, j + 1});
            }
            k--;
        }
        return ans;
    }
}