class Solution {

    static final int MOD = 1000000007;
    public int numOfWays(int[] nums) {
        

        int n = nums.length;
        long[][] dp = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;

            for (int j = 1; j < i; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
            }
        }

        java.util.List<Integer> list = new java.util.ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        return (int) ((solve(list, dp) - 1 + MOD) % MOD);
        
    }

    private long solve(java.util.List<Integer> nums, long[][] dp) {
        int n = nums.size();

        if (n <= 2) {
            return 1;
        }

        int root = nums.get(0);

        java.util.List<Integer> left = new java.util.ArrayList<>();
        java.util.List<Integer> right = new java.util.ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (nums.get(i) < root) {
                left.add(nums.get(i));
            } else {
                right.add(nums.get(i));
            }
        }

        long leftWays = solve(left, dp);
        long rightWays = solve(right, dp);

        long ways = dp[n - 1][left.size()];
        ways = (ways * leftWays) % MOD;
        ways = (ways * rightWays) % MOD;

        return ways;
    }
}