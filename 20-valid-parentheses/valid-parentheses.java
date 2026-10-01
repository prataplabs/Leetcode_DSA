class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                sta.push(c);
            }else{
                if(sta.isEmpty()){
                    return false;
                }
                if( (c == ')' && sta.peek() == '(') || (c == '}' && sta.peek() == '{') || (c == ']' && sta.peek() == '[') ){
                    sta.pop();
                }else{
                    return false;
                }
            }
        }

        if(sta.isEmpty()){
            return true;
        }

        return false;

        
    }
}