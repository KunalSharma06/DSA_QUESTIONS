class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        for (int i = 0; i < m; i++) {
            char[] row = new char[n];

            for (int j = 0; j < n; j++) {
                row[j] = '#';
            }

            grid[i] = new String(row);
        }

        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            arr[i] = grid[i].toCharArray();
        }

        for (int j = 0; j < n; j++) {
            arr[0][j] = '.';
        }

        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = '.';
        }

        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(arr[i]);
        }

        return ans;
    }
}