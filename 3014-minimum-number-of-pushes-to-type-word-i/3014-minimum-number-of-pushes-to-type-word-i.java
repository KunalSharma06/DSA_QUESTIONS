class Solution {
    public int minimumPushes(String word) {
        // int[] freq = new int[26];
        // for(char ch : word.toCharArray()){
        //     freq[ch - 'a']++;
        // }
        // Arrays.sort(freq);
        // int ans = 0;
        // int count = 0;
        // for(int i = 25; i >= 0; i--){
        //     if(freq[i] == 0){
        //         continue;
        //     }
        //     ans += freq[i] * (count / 8 + 1);
        //     count++;
        // }
        // return ans;

        // Set<Character> set = new HashSet<>();
        // int pushes = 1;
        // int pushesCount = 0;
        // int setSize = 0;
        // for(char ch : word.toCharArray()){
        //     if(setSize == 8){
        //         setSize = 0;
        //         pushes++;  
        //     } 

        //     set.add(ch);
        //     setSize++;
        //     pushesCount += pushes;   
        // }

        // return pushesCount;

        int pushes = 1;
        int ans = 0;
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (count == 8) {
                pushes++;
                count = 0;
            }

            ans += pushes;
            count++;
        }

        return ans;
    }
}