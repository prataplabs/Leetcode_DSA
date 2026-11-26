class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }

        boolean ans = true;
        
        int sub = 10;
        n = n-sub;
        sub--;
      

        while(n > 0){
         if(sub > n){
                return ans;
          }
            n = n-sub;
            sub--;
            ans = !ans;
        }

        return ans;
    }
}