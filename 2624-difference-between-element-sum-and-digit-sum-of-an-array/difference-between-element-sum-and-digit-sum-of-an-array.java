class Solution {
    public int differenceOfSum(int[] nums) {
        int eleS = 0;
        int digs = 0;
        for(int num : nums){
            eleS += num;
            digs += helper(num);

        }

        return Math.abs(eleS - digs);
    }

    private int helper(int n){
        int sum = 0;
        while(n != 0){
            int dig = n%10;
            sum += dig;
            n = n/10;
        }

        return sum;
    }
}