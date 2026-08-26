class Solution {
    public long calculateScore(String s) {
        HashMap<Character,Stack<Integer>> map = new HashMap<>();
        long ans = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char mirror = (char) ('z' - (ch - 'a'));

            if(map.containsKey(mirror) && !map.get(mirror).isEmpty()){
                int j = map.get(mirror).pop();
                ans += Math.abs(j - i);
            }else{
                if(!map.containsKey(ch)){
                    map.put(ch, new Stack<>());
                }
                map.get(ch).push(i);
            }
        }
        return ans;
    }
}