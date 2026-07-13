class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i=1; i<= 9; i++){
            StringBuilder temp = new StringBuilder();
            temp.append(i);
          helper( low,  high, ans, temp, i);
        }
        Collections.sort(ans);
        return ans;
        
    }

    private void helper(int low, int high, List<Integer> ans, StringBuilder temp, int lastdig){
        int num = Integer.parseInt(temp.toString());
        
        if(num > high){
            return;
        }

        if(num >= low){
            ans.add(num);
        }

        if(lastdig == 9){
            return;
        }

        temp.append(lastdig + 1);

        helper( low,  high, ans, temp, lastdig +1);

        temp.deleteCharAt(temp.length() - 1);
         
    }
}