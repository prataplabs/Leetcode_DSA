class Solution {
    public void sortColors(int[] nums) {
       for(int i=0; i<nums.length ; i++){
        if(i>0 ){
            int check = i;
            int j = i-1;
            while(check>=1 && nums[check] < nums[j]){
                int temp = nums[j];
                nums[j] = nums[check];
                nums[check] = temp;
                check--;
                j--;
            }
        }
       }
    }
}