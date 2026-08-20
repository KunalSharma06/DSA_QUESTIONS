class Solution {
    public List<String> letterCombinations(String digits) {
        return helper("", digits);
    }
    private List<String> helper(String ans, String digits){
        if(digits.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = digits.charAt(0) - '0';
        List<String> list = new ArrayList<>();

        int start = (digit - 2) * 3;
        if(digit > 7) start++;
        int end = start + 3;

        if(digit == 7 || digit == 9) end++;
        for(int i = start; i < end; i++){
            char ch = (char)('a' + i);
            list.addAll(helper(ans + ch, digits.substring(1)));
        }
        return list;
    }
}