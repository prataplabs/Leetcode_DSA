class Solution {
    public int maxWidthRamp(int[] nums) {
        int i=0;
        int j=0;
        int ans = 0;
        int n = nums.length;

        int[] lmin = new int[n];
        int[] rmax = new int[n];

        lmin[0] = nums[0];
        for(int k=1; k<n; k++){
            lmin[k] = Math.min(lmin[k-1], nums[k] );
        }

        rmax[n-1] = nums[n-1];
        for(int k=n-2; k >= 0; k--){
            rmax[k] = Math.max(rmax[k+1], nums[k] );
        }

        while(i < n && j < n){
            if(lmin[i] <= rmax[j]){
                ans = Math.max(ans, j-i);
                j++;
            }else{
                i++;
            }
        }
        
        return ans;
    }
}