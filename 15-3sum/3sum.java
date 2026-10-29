class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums.length -2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int lef = i+1;
            int rig = nums.length -1;

            while(lef < rig){
                int sum = nums[i] + nums[lef] + nums[rig];

                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
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
                }else if(sum < 0){
                    lef++;
                }else{
                    rig--;
                }
            }
        }

        return ans;


        
    }
}