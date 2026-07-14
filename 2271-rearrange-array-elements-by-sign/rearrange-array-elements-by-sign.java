class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num : nums){
            if(num < 0){
               neg.add(num);
            }else{
                pos.add(num);
            }
        }

        int ans[] = new int[nums.length];
        int j=0;
        int i=0;
        while(j < nums.length){
            ans[j] = pos.get(i);
            ans[j+1] = neg.get(i);

            j=j+2;
            i++;
        }

        return ans;


        

        
    }
}