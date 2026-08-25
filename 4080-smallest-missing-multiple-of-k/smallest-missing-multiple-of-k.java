class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n: nums){
           arr.add(n);
        }

        for(int i=1 ; i<=1000 ; i++){
            if(! arr.contains(k*i)){
                return k*i;
            }
        }

        return 0;
        
    }
}