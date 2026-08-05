class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int Fans = 0;

        for(int i=0; i<n; i++){
           int fistc = colors[i]; 
           int ans = helper(colors, fistc,i+1 );
           Fans = Math.max(ans, Fans);

        }

        return Fans;
        
        
    }

    private int helper(int[] colors, int fistc, int idx){
        int count =1;
        int ans = 0;

        for(int i=idx; i<colors.length; i++){
            if(colors[i] != fistc){
                ans = Math.max(ans, count);
            }
            count++;
        }

        return ans;
    }
}