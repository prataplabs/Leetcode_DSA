class Solution {
    class Info{
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       ArrayList<ArrayList<int[] >> adj = new ArrayList<>(); 
       int dist[] = new int[n];
       Arrays.fill(dist, Integer.MAX_VALUE);
       dist[src] = 0;

       for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
       }

       for(int[] flight : flights ){
        adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
       }

       Queue<Info> q = new LinkedList<>();
       q.add(new Info(src, 0, 0));

       while( !q.isEmpty()){
        Info curr = q.remove();
        if(curr.stops > k){
            break;
        }

         for(int[] nei : adj.get(curr.v) ){
            int v = nei[0];
            int wt = nei[1];

            if(curr.cost + wt < dist[v] && curr.stops <= k){
                dist[v] = curr.cost + wt;
                q.add(new Info(v, dist[v], curr.stops +1));
            }
         }
        }

        if(dist[dst] == Integer.MAX_VALUE){
            return -1;
        }else {
            return dist[dst];
        }
    }
}