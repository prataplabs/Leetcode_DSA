class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int[] rmax = new int[n];
        
        rmax[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            rmax[i] = Math.max(rmax[i+1] , nums[i]);
        }

        int ans = -1;
        for(int i=0 ; i < n-1; i++){
            if(rmax[i+1] > nums[i]){
            int currd = rmax[i+1] - nums[i];
            ans = Math.max(ans, currd);
            }
        }

        return ans;
        

    }
}