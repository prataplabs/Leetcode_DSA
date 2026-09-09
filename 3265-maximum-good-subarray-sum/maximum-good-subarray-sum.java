class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], prefix);
            } else {
                map.put(nums[i], Math.min(map.get(nums[i]), prefix));
            }

            prefix += nums[i];

            
            if (map.containsKey(nums[i] - k)) {
                ans = Math.max(
                    ans,
                    prefix - map.get(nums[i] - k)
                );
            }

           
            if (map.containsKey(nums[i] + k)) {
                ans = Math.max(
                    ans,
                    prefix - map.get(nums[i] + k)
                );
            }
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
        
    }
}