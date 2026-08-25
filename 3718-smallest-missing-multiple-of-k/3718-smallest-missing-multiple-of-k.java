class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int value = 0;
        for(int i = k; ; i += k){
            if(!set.contains(i)){
                value = i;
                break;
            }
        }
        return value;
    }
}