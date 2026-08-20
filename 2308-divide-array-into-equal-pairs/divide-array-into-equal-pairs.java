class Solution {
    public boolean divideArray(int[] nums) {
        
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0 ; i<nums.length; i++){
            if(ans.contains(nums[i])){
                ans.remove(nums[i]);
            }else{
                ans.add(nums[i]);
            }
        }

        
     return ans.isEmpty();
        
    }
}