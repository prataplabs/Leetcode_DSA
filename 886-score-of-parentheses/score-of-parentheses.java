class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> sta = new Stack<>();
        int count = 0;

        for(int i=0 ; i < s.length(); i++){
            char c= s.charAt(i);
            if(c == '('){
                sta.push(count);
                count = 0;
            }
            else{
                int prev = sta.pop();

                if(count == 0){
                    count = 1;
                }else{
                       count = 2 * count;
                }

                count = prev + count;

                
            }

           
        }

       return count;

    
    }
}