class Solution {
    public int distinctIntegers(int n) {
        // if(n == 1) return 1;
        // return n - 1;

        Set<Integer> set = new HashSet<>();
        set.add(n);

        boolean changed = true;

        while (changed) {
            changed = false;
            List<Integer> current = new ArrayList<>(set);

            for (int x : current) {

                for (int i = 1; i <= n; i++) {

                    if (x % i == 1 && !set.contains(i)) {
                        set.add(i);
                        changed = true;
                    }
                }
            }
        }

        return set.size();
    }
}