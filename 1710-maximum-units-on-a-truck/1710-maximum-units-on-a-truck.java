class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int ans = 0;
        for(int i = 0; i < boxTypes.length; i++){
            int boxes = boxTypes[i][0];
            int units = boxTypes[i][1];
            if(boxes <= truckSize){
                ans += boxes * units;
                truckSize -= boxes;
            }else if(truckSize != 0 && boxes > truckSize){
                ans += units * (Math.min(boxes, truckSize));
                truckSize = 0;
            }
        }
        return ans;
    }
}