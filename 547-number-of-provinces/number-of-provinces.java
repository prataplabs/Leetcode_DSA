class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean[] vis = new boolean[v];
        int ans = 0; 

        for(int i=0; i < v; i++){
            if(!vis[i]){
                dfs(i, isConnected, vis);
                ans++;

            }
        }
        
        return ans;
    }

    private void dfs(int src,int[][] isConnected, boolean[] vis){
        vis[src] = true;

        for(int i=0; i < isConnected.length ; i++){
          if (isConnected[src][i] == 1 && !vis[i]) {
            dfs(i, isConnected, vis);
          }
        }
    }
}