class Solution {
    public long removeZeros(long n) {

        return helper(n);
        
    }

    private long helper(long n){
        long ans = 0;
        long place = 1;
        while(n != 0){
           long dig = n%10;
           if(dig != 0){
            ans += dig*place;
            place *= 10;
           } 

           n /= 10;
        }

        

        return ans;
    }
}