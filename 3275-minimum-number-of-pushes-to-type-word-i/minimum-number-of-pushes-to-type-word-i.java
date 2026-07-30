class Solution {
    public int minimumPushes(String word) {
        int totalp = 0;
        int n = word.length();

        for(int i=0; i < n ; i++){
            totalp += (i/8) + 1;
        }

        return totalp;
        
    }
}