class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String ch : words){
            if(s.startsWith(ch)){
                count++;
            }
        }
        return count;
    }
}