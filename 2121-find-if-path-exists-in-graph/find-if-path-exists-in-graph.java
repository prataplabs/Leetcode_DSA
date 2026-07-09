class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visit = new boolean[n];
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i < n; i++ ){
            adj.add(new ArrayList<>());
            
            
        }
        
        for(int i=0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        
        return helper(adj, source ,destination, visit  );
    }

     private boolean helper(ArrayList<ArrayList<Integer>> adj, int src, int des, boolean[] visit){
        if(src == des){
            return true;
        }
        
        visit[src] = true;
        
        for(int i=0; i < adj.get(src).size(); i++){
            int curr = adj.get(src).get(i);
            if(!visit[curr] && helper(adj ,curr, des, visit  )){
                return true;
            }
        }
        
        return false;
    }
}