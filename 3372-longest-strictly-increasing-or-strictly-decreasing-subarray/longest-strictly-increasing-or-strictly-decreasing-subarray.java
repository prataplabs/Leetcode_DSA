class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        
        int max = 0;
        int Ic = 1;
        int Dc = 1;

        for(int i=0; i < nums.length - 1 ; i++){
            if(nums[i] < nums[i+1]){
                Dc++;
                Ic = 1;
                max = Math.max(max, Math.max(Ic, Dc));
                
            }else if(nums[i] > nums[i+1]){
                Ic++ ;
                 Dc = 1;
                max = Math.max(max, Math.max(Ic, Dc));
               
            }else {
                Ic=1;
                Dc=1;
                max = Math.max(max, Math.max(Ic, Dc));
            }

        }

        return max;

    }
}