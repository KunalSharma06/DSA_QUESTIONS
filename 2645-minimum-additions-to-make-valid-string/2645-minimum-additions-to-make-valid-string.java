class Solution {
    public int addMinimum(String word) {
        int ans = 0;
        int expected = 0;
        int i = 0;
        while(i < word.length()){
            int current = word.charAt(i) - 'a';
            if(current == expected){
                expected = (expected + 1) % 3;
                i++;
            }else{
                ans++;
                expected = (expected + 1) % 3;
            }
        }
        while(expected != 0){
            ans++;
            expected = (expected + 1) % 3;
        }
        return ans;
    }
}