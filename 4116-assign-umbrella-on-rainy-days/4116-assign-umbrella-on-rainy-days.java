class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        String[] ans = new String[n];

        int a = 0, b = 0;

        for (int i = 0; i < n; i++) {
            if (rain[i] == 1 && i < n - 1 && rain[i + 1] == 1) {
                if (a <= b) {
                    ans[i] = "Alice";
                    a++;
                } else {
                    ans[i] = "Bob";
                    b++;
                }
            } 
            else if (rain[i] == 1) {
                ans[i] = "Bob";
                b++;
            } 
            else {
                ans[i] = "None";
            }
        }

        return ans;
    }
}