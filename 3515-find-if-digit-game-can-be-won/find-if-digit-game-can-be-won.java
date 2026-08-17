class Solution {
    public boolean canAliceWin(int[] nums) {
        int sdig = 0;
        int ddig = 0;

        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] <= 9){
                sdig += nums[i];
            }else{
                ddig += nums[i];
            }
        }

        if(sdig > ddig || sdig < ddig){
            return true;
        }

        return false;
        
    }
}