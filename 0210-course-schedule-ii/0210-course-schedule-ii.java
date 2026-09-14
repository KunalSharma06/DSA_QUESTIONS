class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = numCourses;
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] indegree = new int[n];
        for(int i = 0; i < n; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int[] ans = new int[n];
        int index = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            ans[index] = node;
            index++;
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        if(index == n){
            return ans;
        }
        return new int[0];
    }
}