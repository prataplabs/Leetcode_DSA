class Solution {
    public int sumOfBeauties(int[] nums) {
        int beautyc = 0;
        int[] Lmax = new int[nums.length];
        int[] Rmin = new int[nums.length];
        
        
        Lmax[0] = nums[0];
        for(int i=1; i < nums.length; i++ ){
          Lmax[i] =  Math.max(Lmax[i-1], nums[i]);
           
        }
        
        Rmin[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i >= 0; i-- ){
            Rmin[i] =   Math.min(Rmin[i+1], nums[i]);
          
        }
        

        for(int i=1; i < nums.length -1; i++ ){
            if(Lmax[i-1] < nums[i] && nums[i] < Rmin[i+1] ){
                // beautyc++;
                 beautyc = beautyc +2;
            }else if(  nums[i] > nums[i-1] && nums[i] < nums[i+1]){
                // beautyc = beautyc +1;
                 beautyc++;
            }
        }

        return beautyc;
        
    }
}