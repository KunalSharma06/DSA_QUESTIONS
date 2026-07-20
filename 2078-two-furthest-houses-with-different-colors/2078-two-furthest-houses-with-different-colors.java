class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int n = colors.length;
        // for(int i = 0; i < colors.length; i++){
        //     for(int j = i + 1; j < colors.length; j++){
        //         if(colors[i] != colors[j]){
        //             max = Math.max(max, j - i);
        //         }
        //     }
        // }

        for(int i = 0; i < n; i++){
            if(colors[i] != colors[n - 1]){
                max = Math.max(max, n - i - 1);
                break;
            }
        }

         for(int i = n - 1; i >= 1; i--){
            if(colors[i] != colors[0]){
                max = Math.max(max, i);
                break;
            }
        }

        return max;
    }
}