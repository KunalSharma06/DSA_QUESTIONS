class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n = nums.length;
       int[] arr = new int[n - k + 1];
       Deque<Integer> dq = new ArrayDeque<>();
       int index = 0;
       for(int right = 0; right < n; right++){
        if(!dq.isEmpty() && dq.peekFirst() <= right - k){
            dq.pollFirst();
        }
        while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[right]){
            dq.pollLast();   
        }

        dq.addLast(right);
        if(right >= k - 1){
            arr[index] = nums[dq.peekFirst()];
            index++;
        }
       } 
       return arr;
    }
}