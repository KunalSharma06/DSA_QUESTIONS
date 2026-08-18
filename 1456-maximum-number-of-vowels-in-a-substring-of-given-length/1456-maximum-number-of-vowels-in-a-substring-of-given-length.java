class Solution {
    public boolean vowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int max = 0;
        for(int right = 0;  right < s.length(); right++){
            if(vowel(s.charAt(right))){
                count++;
            }

            if(right - left + 1 == k){
                max = Math.max(max, count);
                if(vowel(s.charAt(left))){
                    count--;
                }

                left++;
            }
        }
        return max;
    }
}

 // for(int i = 0; i <= s.length() - k; i++){
        //     int count = 0;

        //     for(int j = i; j < i + k; j++){
        //         if(vowel(s.charAt(j))){
        //             count++;
        //         }
        //     }
        //     max = Math.max(max, count);
        // }
        // return max;