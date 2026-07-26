class Solution {
    public long maxProduct(int[] nums) {
        int rep = 100000;
        ArrayList<Long> arr = new ArrayList<>();
        for(int num : nums){
            long dig = Math.abs(num);
            
            arr.add(dig);
        }

        Collections.sort(arr);
        long prod = arr.get(arr.size() -1)*arr.get(arr.size() -2);
        prod = prod * rep;
        return prod;

        
    }
}