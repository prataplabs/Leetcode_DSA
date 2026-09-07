class Solution {
    public int[] findErrorNums(int[] nums) {
        // int n = nums.length;
        // int[] count = new int[n+1];
        // int[] ans = new int[2];

        // for(int i=0; i<n; i++){
        //     count[nums[i]]++;
        // }

        // int dup = -1;
        // int mis = -1;
        // int k =0;

        // for(int i=1; i<=n ; i++){
        //     if(count[i] == 2){
        //        ans[k] = i;
        //        k++;
        //     }else if(count[i] == 0){
        //         ans[k] = i;            }
        // }

        // return ans;
        
        int dup = -1, missing = -1;
        
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        
        return new int[] {dup, missing};
        
    }
}