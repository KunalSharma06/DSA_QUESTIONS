class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        int left = 0;
        int right = 0;
        
        int[] arr = new int[3];
        while(right < n){
            arr[s.charAt(right) - 'a']++;

            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0){
                ans += s.length() - right;

                arr[s.charAt(left) - 'a']--;

                left++;
            }
            right++;
        }
        // int ans = 0;
        // for(int i = 0; i < s.length(); i++){
        //     boolean a = false;
        //     boolean b = false;
        //     boolean c = false;

        //     for(int j = i; j < s.length(); j++){
        //         if(s.charAt(j) == 'a') a = true;
        //         if(s.charAt(j) == 'b') b = true;
        //         if(s.charAt(j) == 'c') c = true;

        //         if(a && b && c){
        //             ans++;
        //         }
        //     }
        // }
        return ans;
    }
}