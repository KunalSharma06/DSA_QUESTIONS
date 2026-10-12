class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int n = queries.length;
        int[] res = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            int x = queries[i][0];
            int y = queries[i][1];

            int dis = Math.abs(x) + Math.abs(y);
            pq.add(dis);
            if(pq.size() > k){
                pq.poll();
            }
            if(pq.size() < k){
                res[i] = -1;
            }else{
                res[i] = pq.peek();
            }
        }
        return res;
    }
}