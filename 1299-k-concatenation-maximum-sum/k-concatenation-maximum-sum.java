class Solution {
    int mod = 1000000007;
    public int kConcatenationMaxSum(int[] arr, int k) {
       long sum = 0;

        for (int num : arr) {
            sum += num;
        }

        long maxOne = kadane(arr);

        if (k == 1) {
            return (int)(maxOne % mod);
        }

        long maxTwo = kadaneTwo(arr);

        if (sum > 0) {
            maxTwo += (long)(k - 2) * sum;
        }

        return (int)(maxTwo % mod);
    }

     private long kadane(int[] arr) {
        long curr = 0;
        long max = 0;

        for (int num : arr) {
            curr = Math.max(0, curr + num);
            max = Math.max(max, curr);
        }

        return max;
    }

     private long kadaneTwo(int[] arr) {
        long curr = 0;
        long max = 0;

        for (int i = 0; i < 2 * arr.length; i++) {
            int num = arr[i % arr.length];

            curr = Math.max(0, curr + num);
            max = Math.max(max, curr);
        }

        return max;
    }
}