class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] Lmax = new int[n];
        int[] Rmax = new int[n];

        Lmax[0] = nums[0];
        for(int i = 1; i <= n-3 ; i++ ){
            Lmax[i] = Math.max(Lmax[i-1], nums[i]);
        }

        Rmax[n-1] = nums[n-1];
        for(int i=n-2; i >= 2 ; i-- ){
            Rmax[i] = Math.max(Rmax[i+1], nums[i]);
        }
        long maxp = 0L;
        for(int i=1; i < n-1; i++ ){
            long currp = (Lmax[i-1] - nums[i])*(long)Rmax[i+1];
            maxp = Math.max(currp , maxp);

        }

        return maxp;


        
    }
}