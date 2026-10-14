class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < barcodes.length; i++){
            map.put(barcodes[i], map.getOrDefault(barcodes[i], 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        for(int key : map.keySet()){
            pq.add(new int[]{key, map.get(key)});
        }
        int[] prev = null;
        int[] ans = new int[barcodes.length];
        int idx = 0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            ans[idx++] = curr[0];
            curr[1]--;
            if(prev != null && prev[1] > 0){
                pq.add(prev);
            }
            prev = curr;
        }
        return ans;
    }
}