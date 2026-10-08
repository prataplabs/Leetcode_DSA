class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> sta = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if( c == '('){
                if(!sta.isEmpty()){
                    sb.append(c);
                }
                sta.push(c);
                
            } else {
                sta.pop();
                if (!sta.isEmpty()) sb.append(c);
            }
        }

        return sb.toString();
        
    }
}