class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n = monsters.length;
        long[] bonus = new long[n + 1];
        for(int i = 0; i < boosts.length; i++){
            int l = boosts[i][0];
            int r = boosts[i][1];
            int val = boosts[i][2];
            bonus[l] += val;

            if(r + 1 < n){
                bonus[r + 1] -= val;
            }
        }
        for(int i = 1; i < n; i++){
            bonus[i] += bonus[i - 1];
        }
        long low = 0;
        long high = 0;
        for(int x : monsters){
            high += x;
        }
        while(low < high){
            long mid = (low + high) / 2;
            long power = mid;
            boolean flag = true;

            for(int i = 0; i < n; i++){
                if(power + bonus[i] < monsters[i]){
                    flag = false;
                    break;
                }

                power -= monsters[i];
                if(power < 0){
                    power = 0;
                }
            }
            if(flag){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}