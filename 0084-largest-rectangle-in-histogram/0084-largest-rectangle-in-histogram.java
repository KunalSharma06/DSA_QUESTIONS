class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer[]> st = new Stack<>();
        int [] left = new int [heights.length];
        int index = -1;

        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && st.peek()[0] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = index; 
            } else{
                left[i] = st.peek()[1];
            }
            st.push(new Integer[] {heights[i], i});
        }

        Stack<Integer[]> st1 = new Stack<>();
        int [] right = new int [heights.length];
        int index1 = heights.length;

        for(int i = heights.length - 1; i >= 0; i--){
            while(!st1.isEmpty() && st1.peek()[0] >= heights[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                right[i] = index1; 
            } else{
                right[i] = st1.peek()[1];
            }
            st1.push(new Integer[] {heights[i], i});
        }

        int area = 0;
        for(int i = 0; i < heights.length; i++){
            int width = right[i] - left[i] - 1;
            area = Math.max(area, heights[i] * width);
        }
        return area;
    }
}