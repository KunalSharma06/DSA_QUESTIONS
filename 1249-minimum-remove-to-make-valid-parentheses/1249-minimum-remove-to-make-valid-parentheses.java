class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
                ans.append(ch);
            } else if (ch == ')') {
                if (count > 0) {
                    count--;
                    ans.append(ch);
                }
            } else {
                ans.append(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = ans.length() - 1; i >= 0; i--) {
            char ch = ans.charAt(i);

            if (ch == '(' && count > 0) {
                count--;
            } else {
                result.append(ch);
            }
        }

        return result.reverse().toString();
    }
}