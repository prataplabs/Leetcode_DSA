class Solution {
    public int maxScoreSightseeingPair(int[] values) {
         int maxLeft = values[0] + 0;
        int ans = Integer.MIN_VALUE;

        for (int j = 1; j < values.length; j++) {

            
            ans = Math.max(ans, maxLeft + values[j] - j);

          
            maxLeft = Math.max(maxLeft, values[j] + j);
        }

        return ans;
        
    }
}