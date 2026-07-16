class Solution {
    public int gcd(int i, int j){
        if(j == 0){
            return i;
        }
        return gcd(j, i % j);
    }
    public long gcdSum(int[] nums) {
        int max = nums[0];
        List<Integer> arr = new ArrayList<>();
        arr.add(max);
        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            arr.add(gcd(max, nums[i]));
        }
        Collections.sort(arr);
        long sum = 0;
        int i = 0;
        int j = arr.size() - 1;
        while(i < j){
            sum += gcd(arr.get(i), arr.get(j));
            i++;
            j--;
        }
        return sum;
    }
}