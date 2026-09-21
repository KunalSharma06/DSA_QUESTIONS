class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        st.push(asteroids[0]);
        for(int i = 1; i < asteroids.length; i++){
            int fill = 1;
            while(!st.isEmpty() && st.peek() > 0 && asteroids[i] < 0){
                if(st.peek() < -asteroids[i]){
                    st.pop();
                }else if(st.peek() == -asteroids[i]){
                    st.pop();
                    fill = 0;
                    break;
                }else {
                    fill = 0;
                    break;
                }
            }
            if(fill != 0){
                st.push(asteroids[i]);
            }
        }

        int [] arr = new int [st.size()];
        int i = 0;
        for(int val : st){
            if(i < arr.length){
                arr[i++] = val;
            }
        }
        return arr;
    }
}