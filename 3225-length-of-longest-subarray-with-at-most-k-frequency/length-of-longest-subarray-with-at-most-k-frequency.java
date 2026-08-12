class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        int count = 1;
        int n = nums.length;
        int left = 0;
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int right = 0; right<n ; right++){
            int c = nums[right];
            freq.put(c , freq.getOrDefault(c, 0) + 1);
            
           while(freq.get(c) > k){
               int d = nums[left];
               freq.put(d , freq.get(d) - 1);
               left++;
               

              


            }

             count = Math.max(count, right-left +1);
        }

        return count;
    }
}