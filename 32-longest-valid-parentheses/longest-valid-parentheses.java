class Solution {
    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        for(int i=0; i<s.length() ; i++){
            char c = s.charAt(i);

            if(c == '('){
                left++;
            }else if(c == ')'){
                right++;
            }

            if(right > left ){
                right=0; 
                left = 0;
            }else if(left == right){
                max = Math.max(max, left*2);
            }

        }

        left = 0;
        right = 0;

        for(int i=s.length() -1; i>=0 ; i--){
            char c = s.charAt(i);

            if(c == '('){
                left++;
            }else if(c == ')'){
                right++;
            }

            if(right < left ){
                right=0; 
                left = 0;
            }else if(left == right){
                max = Math.max(max, left*2);
            }

        }



        return max;
        
    }
}