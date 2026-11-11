class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        // long cbmax = (long)Math.max(need1, need2)*costBoth;
        // long tot = need1 + need2;
        // long min = Math.min(need1, need2);
        // long cbmin = min*costBoth;
        // if((tot-min) == need1){
        //   cbmin += (long)(need1-min)*cost1;
        // }else{
        //     cbmin += (long)(need2-min)*cost2;
        // }
        

        // long sum = (long)need1*cost1 + need2*cost2;

        // return Math.min(cbmax, Math.min(cbmin, sum));

        long cbmax = (long) Math.max(need1, need2) * costBoth;

        long min = Math.min(need1, need2);

        long cbmin = min * costBoth
                   + (long) (need1 - min) * cost1
                   + (long) (need2 - min) * cost2;

        long sum = (long) need1 * cost1 + (long) need2 * cost2;

        return Math.min(cbmax, Math.min(cbmin, sum));

    
    }
}