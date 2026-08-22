class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int org = n;

        while(n != 0){
            int dig = n%10;
            sum += dig;
            prod *= dig;
            n /= 10;
        }

        sum = sum + prod;

        if(org % sum == 0){
            return true;
        }

        return false;
        
    }
}