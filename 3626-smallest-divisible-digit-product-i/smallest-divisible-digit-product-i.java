class Solution {
    public int smallestNumber(int n, int t) {
        
     for(int i=n ; ; i++){
        int prod = helper(i);

        if(prod%t == 0){
            return i;
        }
        
     }
        
    }

    private int helper(int n){
        int prod = 1;
        while( n != 0){
            int dig = n%10;
            prod *= dig;
            n /= 10;
        }
        return prod;
    }
}