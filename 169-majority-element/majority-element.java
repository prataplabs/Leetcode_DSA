class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int count = 1;
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > n/2){
                    return nums[i];
                }
            }else{
                count = 1;
            }
        }

        return 0;
        
    }
}