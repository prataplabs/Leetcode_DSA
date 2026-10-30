class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums.length -3 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j=i+1 ; j< nums.length-2 ; j++){

                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }

            int lef = j+1;
            int rig = nums.length -1;

            while(lef < rig){
                long sum = (long)nums[i] + nums[j] + nums[lef] + nums[rig];

                if(sum == target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[lef]);
                    temp.add(nums[rig]);

                    ans.add(temp);

                    while(lef < rig && nums[lef] == nums[lef+1]){
                        lef++;
                    }

                    while(lef < rig && nums[rig] == nums[rig-1]){
                        rig--;
                    }


                    lef++;
                    rig--;
                }else if(sum < target){
                    lef++;
                }else{
                    rig--;
                }
            }

            }

            
            
        }

        return ans;

        
    }
}