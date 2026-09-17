class Solution {
    public void sortColors(int[] nums) {
        for(int i=1; i<nums.length ; i++){
            int j=i;
            while(nums[j] < nums[j-1]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                if(j !=1){
                 
                 j--;
                }
                 

            }
        }
        
    }
}