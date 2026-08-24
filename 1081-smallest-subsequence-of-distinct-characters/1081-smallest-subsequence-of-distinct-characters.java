class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch : s.toCharArray()){
            freq[ch - 'a']--;

            if(used[ch - 'a']){
                continue;
            }

            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                char c = st.pop();
                used[c - 'a'] = false;
            }
            st.push(ch);
            used[ch - 'a'] = true;
        }

        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append((char) st.pop());
        }
        return str.reverse().toString();
    }
}