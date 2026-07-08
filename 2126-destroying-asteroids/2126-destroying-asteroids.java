class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long sum = mass;
        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] <= sum){
                sum += asteroids[i];
                asteroids[i] = 0;
            }else{
                asteroids[i] = -1;
            }
        }

        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] != 0){
                return false;
            }
        }
        return true;
    }
}