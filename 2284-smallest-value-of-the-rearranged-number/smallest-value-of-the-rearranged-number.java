class Solution {
    public long smallestNumber(long num) {
        if(num == 0){
            return 0;
        }

        boolean neg = num < 0;

        String str = Long.toString(Math.abs(num));
        char[] digits = str.toCharArray();

        Arrays.sort(digits);
        long ans = 0;

        if(!neg){
            int firstnonzero = 0;

            while(digits[firstnonzero] == '0'){
                firstnonzero++;
            }

            char temp = digits[0];
            digits[0] = digits[firstnonzero];
            digits[firstnonzero] = temp;
            

            for(char c : digits){
              ans = ans*10 + (c - '0');
            }

            return ans;
            
        }else {
            for(int i = digits.length -1; i >= 0; i--){
                ans = ans*10 + (digits[i] - '0');
            }

            return -ans;
        }
        
    }
}