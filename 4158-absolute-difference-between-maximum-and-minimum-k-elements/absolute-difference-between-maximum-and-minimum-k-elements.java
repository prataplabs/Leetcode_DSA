class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int i=0; 
        int lowest = 0;
        int high = 0;

        while(i < k){
            lowest += nums[i];
            i++;
        }

        int j=1;
        while(k > 0){
            high += nums[n-j];
            j++;
            k--;
        }

        return high - lowest;
        
    }
}