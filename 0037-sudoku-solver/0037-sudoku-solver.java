class Solution {
    private boolean isValid(char[][] board, int row, int col, char ch){
        for(int i = 0; i < 9; i++){
            if(board[row][i] == ch) return false;
        }

        for(int i = 0; i < 9; i++){
            if(board[i][col] == ch) return false;
        }

        int srow = row / 3 * 3;
        int scol = col / 3 * 3;

        for(int i = srow; i <= srow + 2; i++){
            for(int j = scol; j <= scol + 2; j++){
                if(board[i][j] == ch){
                    return false;
                }
            }
        }
        return true;

    }
    private boolean helper(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;

        if(nextCol == 9){
            nextRow = row + 1;
            nextCol = 0;
        }

        if(board[row][col] != '.'){
            return helper(board, nextRow, nextCol);
        }
        else{
            for(char ch = '1'; ch <= '9'; ch++){
                if(isValid(board, row, col, ch)){
                    board[row][col] = ch;

                    if(helper(board, nextRow, nextCol)) return true;
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}













// class Solution {
//     private boolean isValid(char[][] board, int row, int col, char ch){
//         for(int i = 0; i < 9; i++){
//             if(board[row][i] == ch) return false;
//         }

//         for(int i = 0; i < 9; i++){
//             if(board[i][col] == ch) return false;
//         }

//         int srow = row / 3 * 3;
//         int scol = col / 3 * 3;

//         for(int i = srow; i < srow + 2; i++){
//             for(int j = scol; j < scol + 2; j++){
//                 if(board[srow][scol] == ch){
//                     return false;
//                 }
//             }
//         }
//         return true;

//     }
//     private boolean helper(char[][] board, int row, int col){
//         if(row == 9){
//             return true;
//         }

//         int nextRow = row;
//         int nextCol = col + 1;

//         if(nextCol == 9){
//             nextRow = row + 1;
//             nextCol = 0;
//         }

//         if(board[row][col] != '.'){
//             if(col != 8){
//                 helper(board, row, col + 1);
//             }else{
//                 helper(board, row + 1, 0);
//             }
//         }else{
//             for(char ch = '1'; ch <= '9'; ch++){
//                 if(isValid(board, row, col, ch)){
//                     board[row][col] = ch;
//                     if(col != 8){
//                          helper(board, row, col + 1);
//                          return true;
//                     }else{
//                         helper(board, row + 1, 0);
//                         return true;
//                     }
//                     board[row][col] = '.';
//                 }
//             }
//         }
//         return false;
//     }
//     public void solveSudoku(char[][] board) {
//         helper(board, 0, 0);
//     }
// }