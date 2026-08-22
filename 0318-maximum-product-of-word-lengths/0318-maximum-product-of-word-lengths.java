class Solution {
    public int maxProduct(String[] words) {
        int ans = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                boolean[] letters = new boolean[26];

                for(char ch : words[i].toCharArray()){
                    letters[ch - 'a'] = true;
                }
                boolean common = false;
                for(char ch : words[j].toCharArray()){
                    if(letters[ch - 'a']){
                        common = true;
                        break;
                    }
                }
                if(!common){
                    int prod = words[i].length() * words[j].length();
                    ans = Math.max(ans, prod);
                }
            }
        }
        return ans;
    }
}