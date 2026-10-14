class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if(num*9 < sum){
            return sb.toString();
        }

        for(int i=0; i<num ; i++){
            int dig = Math.min(sum, 9);
            sb.append(dig);
            sum -= dig;
        }

        return sb.toString();


        

    }
}