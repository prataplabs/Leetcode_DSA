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

        // 
        while(j < nums.length){
            ans[j] = pos.get(idx);
            ans[j+1] = neg.get(idx);

            j=j+2;
            idx++;
        }

        return ans;
         
    }
}