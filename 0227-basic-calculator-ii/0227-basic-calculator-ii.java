class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
        char op = '+';
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }
            if(ch != ' ' && (ch < '0' || ch > '9') || i == s.length() - 1){
                if(op == '+'){
                    st.push(num);
                }else if(op == '-'){
                    st.push(-num);
                }else if(op == '*'){
                    int a = st.pop();
                    st.push(a * num);
                }else {
                    int a = st.pop();
                    st.push(a / num);
                }
                op = ch;
                num = 0;
            }
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}