class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxp = 0;

        for(int i=0; i<prices.length ; i++){
            if(prices[i] > buy){
                int pro = prices[i] - buy;
                maxp = Math.max(pro, maxp);
            }else{
                buy = prices[i];
            }
        }
        
        return maxp;
    }
}