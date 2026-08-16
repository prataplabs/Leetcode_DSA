class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans = -1;
        int prevdis = Integer.MAX_VALUE;
        for(int i=0; i<drones.length; i++){
            int x = drones[i][0];
            int y = drones[i][1];
            int ran = drones[i][2];

            int dis = Math.abs(x - target[0]) + Math.abs(y - target[1]);
            if(dis <= ran && prevdis > dis){
                ans = i;
                prevdis = dis;
                
            }
        }

       

        return ans;
        
    }
}