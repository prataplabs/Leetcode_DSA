class Solution {
    public boolean checkValidString(String s) {
       
        int Bcount = 0;
        for(int i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == '*' || c == '('){
                Bcount++;
            }else{
                Bcount--;
            }

            if(Bcount < 0){
                return false;
            }
        }

        Bcount = 0;

        for(int i=s.length() -1; i>= 0 ; i--){
            char c = s.charAt(i);
            if(c == '*' || c == ')'){
                Bcount++;
            }else{
                Bcount--;
            }

            if(Bcount < 0){
                return false;
            }
        }

        return true;
        
    }
}