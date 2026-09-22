class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> opr = new Stack<>();
        int num = 0;
        boolean hasNumber = false;
        boolean expectNumber = true;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
                hasNumber = true;
                expectNumber = false;
            }else if(ch == '('){
                opr.push(ch);
                expectNumber = true;
            }else if(ch == '+' || ch == '-'){
                if(expectNumber){
                    st.push(0);
                }else if(hasNumber){
                    st.push(num);
                    num = 0;
                    hasNumber = false;
                }
                while(!opr.isEmpty() && opr.peek() != '('){
                    int op2 = st.pop();
                    int op1 = st.pop();
                    char oper = opr.pop();
                    if(oper == '+'){
                        st.push(op1 + op2);
                    }else{
                        st.push(op1 - op2);
                    }
                }
                opr.push(ch);
                expectNumber = true;
            }else if(ch == ')'){
                if(hasNumber){
                    st.push(num);
                    num = 0;
                    hasNumber = false;
                }
                while(!opr.isEmpty() && opr.peek() != '('){
                    int op2 = st.pop();
                    int op1 = st.pop();
                    char oper = opr.pop();
                    if(oper == '+'){
                        st.push(op1 + op2);
                    }else{
                        st.push(op1 - op2);
                    }
                }
                if (!opr.isEmpty() && opr.peek() == '(') {
                    opr.pop();
                }
                expectNumber = false;
            }
        }
        if(hasNumber){
            st.push(num);
        }

        while(!opr.isEmpty()){
            int op2 = st.pop();
            int op1 = st.pop();
            char oper = opr.pop();
            if(oper == '+'){
                st.push(op1 + op2);
            }else{
                st.push(op1 - op2);
            }
        }
        return st.pop();
    }
}