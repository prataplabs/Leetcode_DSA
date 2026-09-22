class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        
        int max = 0;
       

        for(int num : set){
            if(!set.contains(num-1)){
                int currnum = num;
                int str = 1;
                 while(set.contains(currnum +1) ){
                  currnum++;
                  str++;
                 }
               max= Math.max(max, str);  
            }
           
        }

        return max;
    }
}