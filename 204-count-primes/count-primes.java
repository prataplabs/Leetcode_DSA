class Solution {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }

        //when you increase count for a num then make all it's multiple as false 
        boolean prime[] = new boolean[n];
        for(int i=2; i<prime.length; i++){
            prime[i] = true;
        }

        int ans = 0;

        for(int i=2; i<n ; i++){
            if(prime[i]){
                ans++;
                for(int j = i*2 ; j < n; j = j+i){
                    prime[j] = false;
                }
            }
        }

        return ans;

        
    }
}