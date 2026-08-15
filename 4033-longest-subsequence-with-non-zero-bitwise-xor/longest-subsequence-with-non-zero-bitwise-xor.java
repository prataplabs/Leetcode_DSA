class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int countzero = 0;

        int n = nums.length;

        for(int right = 0; right < n; right++){
            xor = xor ^ nums[right];

            if(nums[right] == 0){
                countzero++;
            }
        }
        if(xor != 0){
            return n;
        }
        if(countzero == n){
            return 0;
        }

        return n-1;
    }
}