class Solution {
    public int maxDistinct(String s) {
        // HashSet<Character> set = new HashSet<>();
        // for(char ch : s.toCharArray()){
        //     set.add(ch);
        // }
        // return set.size();

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] >= 1){
                count++;
            }
        }
        return count;
    }
}