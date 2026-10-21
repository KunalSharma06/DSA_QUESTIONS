
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }

        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        char min = s.charAt(0);
        char max = s.charAt(0);

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < min) {
                min = s.charAt(i);
            }

            if (s.charAt(i) > max) {
                max = s.charAt(i);
            }
        }

        if (first == min || last == max) {
            return 1;
        }

        if (first == max && last == min) {
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) == min || s.charAt(i) == max) {
                    return 2;
                }
            }

            return 3;
        }

        return 2;
    }
}
