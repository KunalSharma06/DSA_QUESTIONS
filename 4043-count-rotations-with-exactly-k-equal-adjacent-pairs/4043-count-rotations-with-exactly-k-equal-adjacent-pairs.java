// class Solution {
//     public int countRotations(String s, int k) {
//         int n = s.length();
//         int ans = 0;
//         for(int r = 0; r < n; r++){
//             int score = 0;
//             for(int i = 0; i < n - 1; i++){
//                 char a = s.charAt((r + i) % n);
//                 char b = s.charAt((r + i + 1) % n);

//                 if(a == b){
//                     score++;
//                 }
//             }
//             if(score == k){
//                 ans++;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int equal = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                equal++;
            }
        }

        if (k == equal - 1) {
            return equal;
        }

        if (k == equal) {
            return n - equal;
        }

        return 0;
    }
}