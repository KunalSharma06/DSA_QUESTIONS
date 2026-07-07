class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        // int left = 0;
        // int right = cost.length - 1;
        // while(left < right){
        //     int temp = cost[left];
        //     cost[left] = cost[right];
        //     cost[right] = temp;

        //     left++;
        //     right--;
        // }

        // int sum = 0;
        // for(int i = 0; i < cost.length; i+=3){
        //     sum += cost[i];
        //     if(i + 1 < cost.length){
        //         sum += cost[i + 1];
        //     }
        // }
        int count = 0;
        int sum = 0;
        for(int i = cost.length - 1; i >= 0; i--){
            count++;
            if(count == 3){
                count = 0;
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }
}