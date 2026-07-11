class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n];
        
        for(int i=0; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        
        
        int count = 0;
        
        for(int i=0; i < n; i++){
            if(!vis[i]){
                ArrayList<Integer> temp = new ArrayList<>();
                helper(i, adj, vis, temp);
                
                boolean comp = true;
                int size = temp.size();

                for(int node : temp){
                    if(adj.get(node).size() != size -1){
                        comp = false;
                        break;
                    }
                }

                if(comp){
                    count++;
                }
            }
        }
        
        return count;
        
    }

    private void helper(int src, ArrayList<ArrayList<Integer>> adj,
                        boolean[] vis, ArrayList<Integer> temp){

         vis[src] = true;
         temp.add(src);

         for(int next : adj.get(src)){
            if(!vis[next]){
                helper(next, adj, vis, temp);
            }
         }                   

    }
}