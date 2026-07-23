class Solution {
    public int minAddToMakeValid(String s) {
    //    Stack<Character> st = new Stack<>();
    //    for(char ch : s.toCharArray()){
    //     if(ch == '('){
    //         st.push(ch);
    //     }else{
    //         if(!st.isEmpty() && st.peek() == '('){
    //             st.pop();
    //         }else{
    //             st.push(ch);
    //         }
    //     }
    //    }
    //    return st.size();

    int open = 0;
    int add = 0;
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '('){
            open++;
        }else{
            if(open > 0){
                open--;
            }else{
                add++;
            }
        }
    }
    return open + add;
    }
}