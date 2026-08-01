class Solution {
    public int minimumIndex(List<Integer> nums) {
        int candidate = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        int total = 0;
        for(int num : nums){
            if(num == candidate){
                total++;
            }
        }
        int leftCount = 0;
        int n = nums.size();
        for(int i = 0; i < n - 1; i++){
            if(nums.get(i) == candidate){
                leftCount++;
            }
            int rightCount = total - leftCount;
            int leftLength = i + 1;
            int rightLength = n - leftLength;
            if(leftCount * 2 > leftLength && rightCount * 2 > rightLength){
                return i;
            }
        }
        return -1;
    }
}