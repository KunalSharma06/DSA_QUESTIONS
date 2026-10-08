class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return count(nums1, nums2) + count(nums2, nums1);
    }

    public int count(int[] a, int[] b){
        Map<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < b.length; i++){
            for(int j = i + 1; j < b.length; j++){
                long product = (long) b[i] * b[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        int ans = 0;
        for(int x : a){
            long check = (long) x * x;
            if(map.containsKey(check)){
                ans += map.get(check);
            }
        }
        return ans;
    }
}