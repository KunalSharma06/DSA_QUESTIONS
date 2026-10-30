class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int index = 0;
        while(i < n){
            char ch = chars[i];
            int count = 0;
            while(i < n && chars[i] == ch){
                count++;
                i++;
            }
            chars[index] = ch;
            index++;
            if(count > 1){
                String s = String.valueOf(count);
                for(int j = 0; j < s.length(); j++){
                    chars[index] = s.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}