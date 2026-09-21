class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }

        int idx=0;
        int j =0;

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(i %2 == 0){
                ans[i] = pos.get(idx);
                idx++;
            }else{
                ans[i] = neg.get(j);
                j++;
            } 
        }

        return ans;
         
    }
}