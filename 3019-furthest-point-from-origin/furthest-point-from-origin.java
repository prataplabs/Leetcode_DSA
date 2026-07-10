class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countl = 0;
        int countr = 0;
        int count = 0;

        for(int i=0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'L'){
                countl++;
            }else if(ch == 'R'){
                countr++;
            }else{
                count++;
            }
        }

        if(countl == 0 & countr == 0){
            return count;
        }
        if(countl > countr){
            return countl +count - countr; 
        }
        
        return countr +count - countl;
    }
}