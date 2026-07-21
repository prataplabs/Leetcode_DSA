class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) && !ans.contains(c -'0')){
                ans.add(c -'0');
            }
        }
        if(ans.size() <= 1){
            return -1;
        }

        Collections.sort(ans);
        return ans.get(ans.size() - 2);
        
    }
}