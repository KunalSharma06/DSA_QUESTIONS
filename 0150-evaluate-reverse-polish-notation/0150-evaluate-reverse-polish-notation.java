class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                st.push(st.pop() + st.pop());
            }else if(token.equals("-")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2 - n1);
            }else if(token.equals("*")){
                st.push(st.pop() * st.pop());
            }else if(token.equals("/")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2 / n1);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}