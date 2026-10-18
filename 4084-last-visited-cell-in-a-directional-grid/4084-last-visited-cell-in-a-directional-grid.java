class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int r = 0;
        int c = 0;
        visited[r][c] = true;
        while(true){
            int nr = r;
            int nc = c;
            if(grid[r][c] == 'L'){
                nc--;
            }else if(grid[r][c] == 'R'){
                nc++;
            }else if(grid[r][c] == 'U'){
                nr--;
            }else{
                nr++;
            }

            if(nr < 0 || nr >= n || nc < 0 || nc >= m || visited[nr][nc]){
                break;
            }
            r = nr;
            c = nc;
            visited[r][c] = true;
        }
        return new int[]{r, c};
    }
}