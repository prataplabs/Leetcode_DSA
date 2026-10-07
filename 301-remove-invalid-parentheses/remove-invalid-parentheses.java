class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        
        HashSet<String> set = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        
        q.add(s);
        set.add(s);
        
        boolean found = false;
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            
            for(int k = 0; k < size; k++) {
                
                String str = q.poll();
                
                if(isValid(str)) {
                    ans.add(str);
                    found = true;
                }
                
                if(found) {
                    continue;
                }
                
                for(int i = 0; i < str.length(); i++) {
                    
                    char c = str.charAt(i);
                    
                    if(c != '(' && c != ')') {
                        continue;
                    }
                    
                    String newStr = str.substring(0, i) 
                                  + str.substring(i + 1);
                    
                    if(!set.contains(newStr)) {
                        set.add(newStr);
                        q.add(newStr);
                    }
                }
            }
            
            if(found) {
                break;
            }
        }
        
        return ans;
        
    }

     public boolean isValid(String s) {
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if(c == '(') {
                count++;
            }
            else if(c == ')') {
                count--;
                
                if(count < 0) {
                    return false;
                }
            }
        }
        
        return count == 0;
    }
}