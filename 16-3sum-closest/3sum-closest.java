class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        for(int i=0; i<nums.length -2 ; i++){
           

            int lef = i+1;
            int rig = nums.length -1;

            while(lef < rig){
                int sum = nums[i] + nums[lef] + nums[rig];
                


                if(sum == target){
                    return sum;

                }

                int diff = Math.abs(target - sum);
                int oldD = Math.abs(target - ans);
                if(diff < oldD){
                    
                    ans = sum;
                }

                if(sum > target){
                    rig--;
                }else{
                    lef++;
                }
                

            }
        }

        return ans;
        
    }
}