class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int i=0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(i != nums.length && j != index.length){
            int idx = index[j];
            int val = nums[i];

            ans.add(idx , val);

            i++;
            j++;


        }

        int[] res = new int[ans.size()];
        for(int k=0; k <ans.size(); k++  ){
           res[k] = ans.get(k);
        }
        return res;
        
    }
}