class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length <= 2){
            return nums;

        }
        Arrays.sort(nums);
        int[] ans = new int[2];

       
       int j=0;

       for(int i=0; i<nums.length; i++){
        if(i == 0 || nums[i] != nums[i-1]){
            if(i == nums.length-1 || nums[i] != nums[i+1]){
                ans[j] = nums[i];
                j++;
            }
        }
       }
      

       return ans;
        
    }
}