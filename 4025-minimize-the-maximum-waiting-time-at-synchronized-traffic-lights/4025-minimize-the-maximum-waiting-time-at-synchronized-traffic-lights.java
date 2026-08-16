class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max = 0;
        for(int light : lights){
            max = Math.max(max, light);
        }
        int ans = 0;
        for(int time : arrivalTime){
            int rem = time % period;
            int wait;

            if(rem < max){
                wait = 0;
            }else{
                wait = period - rem;
            }
            ans = Math.max(ans, wait);
        }
        return ans;
    }
}