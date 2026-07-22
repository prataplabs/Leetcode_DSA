class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
       HashSet<Integer> ans = new HashSet<>();
        for(int i=0; i < n ; i++){
           int rev = reverse(nums[i]);
          
            ans.add(rev);
            ans.add(nums[i]);
           
           
        }

       
        

       

        return ans.size();
        

        
    }

    private int reverse(int a){
        int ans = 0;
        while(a != 0){
            int dig = a%10;
            ans = ans*10 + dig;
            a /= 10;

        }

        return ans;
    }
}