class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(sumofDig(nums[i]) == i){
                return i;
            }
        }

        return -1;
        
    }

    private int sumofDig(int n){
        int sum = 0;
        while(n != 0){
            int dig = n%10;
            sum += dig;
            n = n/10;

        }

        return sum;
    }
}