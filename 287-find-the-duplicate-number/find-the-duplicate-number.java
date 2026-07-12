class Solution {
    public int findDuplicate(int[] nums) {
       int n = nums.length;
       boolean[] vis = new boolean[n+1];

        for(int i =0; i<nums.length; i++){
          if(vis[nums[i]]){
            return nums[i];
          }else{
            vis[nums[i]] = true;
          }
        }

        return -1;
        
    }
}