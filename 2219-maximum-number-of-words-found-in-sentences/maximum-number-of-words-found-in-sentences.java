class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int Max = 0;

        for(int i=0; i < sentences.length; i++){
          String s = sentences[i];
          for(int j=0; j<s.length() ; j++){
            char c = s.charAt(j);
            if(c == ' '){
                count++;
                 
            }
          }
          Max = Math.max(Max, count + 1);
          count = 0;

        }

        return Max;

        
    }
}