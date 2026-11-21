class Solution {
    public int minRange(int a, int b, int c) {
      
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        int ans = max - min;

        if (a == max)
            ans = Math.min(ans, b + c - min);
        else if (b == max)
            ans = Math.min(ans, a + c - min);
        else
            ans = Math.min(ans, a + b - min);

        return ans;
    }
}