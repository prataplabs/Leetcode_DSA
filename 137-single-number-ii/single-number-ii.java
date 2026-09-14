class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];

        }
        Arrays.sort(nums);

       int i=0;
       while(i<nums.length-1){
        if(nums[i] != nums[i+1]){
            return nums[i];
        }
        i=i+3;
       }

       if(nums[nums.length-1] != nums[nums.length-2]){
        return nums[nums.length-1];
       }

       return 0;
        
    }
}