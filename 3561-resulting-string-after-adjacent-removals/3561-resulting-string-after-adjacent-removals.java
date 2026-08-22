class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                char top = st.peek();
                int diff = Math.abs(top - ch);

                if(diff == 1 || diff == 25){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
            i++;
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}