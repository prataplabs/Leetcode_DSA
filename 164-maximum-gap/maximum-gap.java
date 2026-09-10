class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);

        for(int i=1; i<nums.length ; i++){
            int diff =(nums[i] - nums[i-1] );
            if(max < diff){
                max = diff;
            }
        }

        return max;
        
    }
}