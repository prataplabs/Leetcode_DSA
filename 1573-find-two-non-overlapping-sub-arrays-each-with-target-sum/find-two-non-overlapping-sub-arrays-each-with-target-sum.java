class Solution {
    public int minSumOfLengths(int[] arr, int target) {
                int n = arr.length;

        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);

        int left = 0;
        int right = 0;
        int sum = 0;

        int minLength = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        while (right < n) {

            sum += arr[right];

            
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            
            if (sum == target) {

                int length = right - left + 1;

                
                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, length + best[left - 1]);
                }

                minLength = Math.min(minLength, length);
            }

           
            if (right == 0) {
                best[right] = minLength;
            } else {
                best[right] = Math.min(best[right - 1], minLength);
            }

            right++;
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;

        
    }
}