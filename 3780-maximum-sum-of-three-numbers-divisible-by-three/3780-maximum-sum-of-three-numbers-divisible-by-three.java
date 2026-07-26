class Solution {
    public int maximumSum(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 == 0){
                list1.add(nums[i]);
            }else if(nums[i] % 3 == 1){
                list2.add(nums[i]);
            }else{
                list3.add(nums[i]);
            }
        }
        Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());
        Collections.sort(list3, Collections.reverseOrder());

        int ans = 0;
        if(list1.size() >= 3){
            ans = Math.max(ans, list1.get(0) + list1.get(1) + list1.get(2));
        }
         if(list2.size() >= 3){
            ans = Math.max(ans, list2.get(0) + list2.get(1) + list2.get(2));
        }
        if(list3.size() >= 3){
            ans = Math.max(ans, list3.get(0) + list3.get(1) + list3.get(2));
        }

        if (list1.size() >= 1 && list2.size() >= 1 && list3.size() >= 1){
            ans = Math.max(ans, list1.get(0) + list2.get(0) + list3.get(0));
        }
        return ans;
    }
}