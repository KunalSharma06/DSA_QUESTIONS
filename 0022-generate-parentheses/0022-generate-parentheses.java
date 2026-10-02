class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        solve(n,n,"", str);
        return str;
    }
    public void solve(int open, int close, String s, List<String> str){
        if(open == 0 && close == 0){
            str.add(s);
            return;
        }
        if(open > 0){
            solve(open-1, close, s + "(", str);
        }
        if(close > open){
            solve(open, close-1, s + ")", str);
        }
    }
}
