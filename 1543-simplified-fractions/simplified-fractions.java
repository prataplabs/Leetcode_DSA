class Solution {
    public List<String> simplifiedFractions(int n) {

      List<String> ans = new ArrayList<>();

      for(int deno =2; deno <=n; deno++){
        for(int neo=1; neo<deno; neo++){
            if(gcd(deno, neo) == 1){
                ans.add(neo +"/" + deno);
            }
        }

        
      }

      return ans;
        
    }

    private int gcd(int a, int b){
        while(b != 0){
            int rem = a%b;
            a=b;
            b=rem;
        }

        return a;
    }
}