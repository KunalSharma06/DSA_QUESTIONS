class Solution {
    public int kthSmallest(int[][] mat, int k) {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.add(0);
        for(int i = 0; i < mat.length; i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int sum : sums){
                for(int j = 0; j < mat[i].length; j++){
                    pq.offer(sum + mat[i][j]);
                }
            }
            sums = new ArrayList<>();
            while(!pq.isEmpty() && sums.size() < k){
                sums.add(pq.poll());
            }
        }
        return sums.get(k - 1);
    }
}