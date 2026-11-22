class Solution {
    public boolean checkString(String s) {
        // if(s.length() == 1){
        //     return true;
        // }
        // int idx = 0;
        // boolean bfound = false;
        // for(int i=0; i<s.length() ; i++){
        //     if(s.charAt(i) == 'b'){
        //         bfound = true;
        //         idx = i;
        //         break;
        //     }
        // }

        // if(idx == 0 ){
        //     if(bfound == false){
        //        return true;
        //     }
           
        // }

        

        // for(int i=idx; i < s.length() ; i++ ){
        //     if(s.charAt(i) == 'a' ){
        //         return false;
        //     }
        // }

        // return true;

        boolean ans = true;
        boolean fon = false;

        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == 'b'){
                fon = true;
            }

            if(fon && c == 'a'){
                return false;
            }
        }

        return ans;


        
    }
}