class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        int prefix[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            prefix[i] = gcd(nums[i], max);
        }
        long sum =0;
        int start = 0;
        int end = prefix.length - 1;
        Arrays.sort(prefix);

        while(start < end){
            int temp = gcd(prefix[start], prefix[end]);
            sum += temp;
            start++;
            end--;
        }
        
        return sum;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int rem = a%b;
            a=b;
            b = rem;
        }

        return a;
    }
}