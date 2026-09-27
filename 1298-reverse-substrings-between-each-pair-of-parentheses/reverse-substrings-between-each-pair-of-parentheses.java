class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> sta = new Stack<>();

        for(int i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == ')'){
                StringBuilder sb = new StringBuilder();
                while(!sta.isEmpty() && sta.peek() != '('){
                    sb.append(sta.pop());
                }

                if(!sta.isEmpty()){
                    sta.pop();
                }

                for(int j=0; j<sb.length() ; j++){
                    sta.push(sb.charAt(j));
                }
            }else{
                sta.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        while(!sta.isEmpty()){
            res.append(sta.pop());
        }
        return res.reverse().toString();

        
    }
}