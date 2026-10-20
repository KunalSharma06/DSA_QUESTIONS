class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] next = new int[n][m];
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int live = 0;
                for(int d = 0; d < 8; d++){
                    int x = i + dx[d];
                    int y = j + dy[d];
                    if(x >= 0 && x < n && y >= 0 && y < m && board[x][y] == 1){
                        live++;
                    }
                }
                if(board[i][j] == 1){
                    if(live == 2 || live == 3){
                        next[i][j] = 1;
                    }
                }else{
                    if(live == 3){
                        next[i][j] = 1;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = next[i][j];
            }
        }
    }
}