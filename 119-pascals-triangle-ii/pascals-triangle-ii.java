class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> frow = new ArrayList<>();
        frow.add(1);
        ans.add(frow);

        if(rowIndex == 0){
            return frow;
        }

        

        for(int i=1; i<= rowIndex ; i++){
            List<Integer> prev = ans.get(i-1);

            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=0 ; j < i-1 ; j++){
                curr.add(prev.get(j) + prev.get(j+1));
            }

            curr.add(1);
            ans.add(curr);

        }
        
        return ans.get(ans.size() -1);
    }
}