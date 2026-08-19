class Solution {

    private void dfs(int node,  ArrayList<ArrayList<Integer>> adjLs, int[] visited){
        visited[node] = 1;
        for(Integer it : adjLs.get(node)){
            if(visited[it] == 0){
                dfs(it, adjLs, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            adjLs.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        int count = 0;
        int[] visited = new int[n];
        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                count++;
                dfs(i, adjLs, visited);
            }
        }
        return count;
    }
}