class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] passenger = new int[1001];
        for(int[] trip : trips){
            int count = trip[0];
            int from = trip[1];
            int to = trip[2];
            passenger[from] += count;
            passenger[to] -= count;
        }
        int current = 0;
        for(int i = 0; i < 1001; i++){
            current += passenger[i];
            if(current > capacity){
                return false;
            }
        }
        return true;
    }
}