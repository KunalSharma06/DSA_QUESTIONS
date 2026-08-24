class Solution {
    public int minLengthAfterRemovals(String s) {
        // int countA = 0;
        // int countB = 0;
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == 'a'){
        //         countA++;
        //     }else{
        //         countB++;
        //     }
        // }
        // return Math.abs(countA - countB);

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                if(ch == 'a' && st.peek() == 'b'){
                    st.pop();
                }else if(ch == 'b' && st.peek() == 'a'){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }
}