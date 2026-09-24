// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         int[] nums1 = new int[n+n];
//         for(int i = 0; i < nums.length; i++){
//             nums1[i] = nums[i];
//             nums1[i + n] = nums[i];
//         }

//         int[] result = new int[n+n];
//         Stack<Integer> st = new Stack<>();

//         for(int i = 2 * nums.length - 1; i >= 0; i--){
//             while(!st.isEmpty() && st.peek() <= nums1[i]){
//                 st.pop();
//             }
//             if(st.isEmpty()){
//                 result[i] = -1;
//             }else{
//                 result[i] = st.peek();
//             }
//             st.push(nums1[i]);
//         }
//         int [] res = new int [nums.length];
//         for(int i = 0; i < nums.length; i++){
//             res[i] = result[i];
//         }
//         return res;
//     }
// }


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        for(int i = nums.length - 1; i >= 0;i--){
            st.push(nums[i]);
        }
        int n = nums.length;
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){
             while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            } 
            if(st.isEmpty()) {
                res[i] = -1;
            }
            else {
                res[i] = st.peek();
            }
            st.push(nums[i]);

        }
        return res;
        
    }
}