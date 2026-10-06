class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> sta = new Stack<>();
        for(int i=0 ;i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ')' && !sta.isEmpty() && sta.peek() == '('){
                sta.pop();
            }else{
                sta.push(c);
            }
        }
        
        while(!sta.isEmpty()){
            sta.pop();
            count++;
        }

        return count;
        
    }
}