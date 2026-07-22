class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int ans = 0;
        int i=0;

        for(int house : houses){
            while(i+1 < heaters.length && Math.abs(heaters[i+1] - house) <= Math.abs(heaters[i] - house)){
                i++;
            }

             ans = Math.max(ans, Math.abs(heaters[i] - house));
        }
        

       return  ans; 
    }
}