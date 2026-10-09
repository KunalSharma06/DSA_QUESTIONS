class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        String ans = "";
        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if(ch != ch2 && map.get(ch) == ch - '0' && map.get(ch2) == ch2 - '0'){
                ans = "" + ch + ch2;
                break;
            }
        }
        return ans;
    }
}