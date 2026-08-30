class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int maxidx = 0;
        int minidx = 0;
        int n = nums.length;

        for(int i=0; i<n ; i++){
            if(nums[minidx] > nums[i] ){
                minidx = i;
            }
            if(nums[maxidx] < nums[i] ){
                maxidx = i;
            }
        }

        int left = Math.max(maxidx, minidx) +1;
        int right = n - Math.min(maxidx ,  minidx);
        int both = Math.min(maxidx, minidx) +1 + (n-Math.max(minidx, maxidx));

        return Math.min(left, Math.min(right, both));
        
    }
}