class Solution {
    public int firstMatchingIndex(String s) {
        int ans = -1;

        for(int i=0 ; i < s.length(); i++ ){
            if(s.charAt(i) == s.charAt(s.length() - i -1)){
                ans = i;
                break;
            }
        }
        return ans;
        
    }
}