class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for(int i=0 ; i < date.length() ; i++ ){
            char c = date.charAt(i);
            if( c != '-'){
                temp.append(c);

            }else{
                sb.append(helper(temp));
                sb.append('-');
                temp.setLength(0);

            }
        }

        sb.append(helper(temp));
        
        return sb.toString();
        
    }

    private String helper(StringBuilder sb){
      int n = Integer.parseInt(sb.toString());

        StringBuilder ans = new StringBuilder();

        while(n > 0) {
            int rem = n % 2;
            ans.append(rem);
            n = n / 2;
        }

        return ans.reverse().toString();
    }
}