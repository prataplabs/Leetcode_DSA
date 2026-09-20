class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int idx = c -'a';
            int mul = 26-idx;
            sum = sum + mul*(i+1);
           

        }

        return sum;
        
    }
}