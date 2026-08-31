class Solution {
    private void dfs(int row, int col, char[][] board, int[][] vis, int[] delRow, int[] delCol){
        vis[row][col] = 1;
        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i < 4; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && board[nrow][ncol] == 'O'){
                dfs(nrow, ncol, board, vis, delRow, delCol);
            }
        }
    }
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[] delRow = {-1, 0, +1, 0};
        int[] delCol = {0, +1, 0, -1};

        int[][] vis = new int[rows][cols];
        for(int col = 0; col < cols; col++){
            if(vis[0][col] == 0 && board[0][col] == 'O'){
                dfs(0, col, board, vis, delRow, delCol);
            }
            if(vis[rows - 1][col] == 0 && board[rows - 1][col] == 'O'){
                dfs(rows - 1, col, board, vis, delRow, delCol);
            }
        }

         for(int row = 0; row < rows; row++){
            if(vis[row][0] == 0 && board[row][0] == 'O'){
                dfs(row, 0, board, vis, delRow, delCol);
            }
            if(vis[row][cols - 1] == 0 && board[row][cols - 1] == 'O'){
                dfs(row, cols - 1, board, vis, delRow, delCol);
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(vis[i][j] == 0 && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
}