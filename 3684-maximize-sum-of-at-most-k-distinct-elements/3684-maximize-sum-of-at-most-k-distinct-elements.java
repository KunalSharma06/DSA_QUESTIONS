class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int sum = 0;
        int [] arr;
        if(set.size() > k){
            arr = new int[k];
        }else{
            arr = new int[set.size()];
        }
        int m = 0;
        for(int num : set){
            if(m < k){
                arr[m++] = num;
            }
        }
        return arr;
    }
}