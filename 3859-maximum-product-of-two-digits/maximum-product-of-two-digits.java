class Solution {
    public int maxProduct(int n) {
        int prod = 1;
        int ans = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        if(n <= 99){

            while(n != 0){
            int dig = n%10;
            prod *= dig;
            
            n /= 10;
           }

         return prod;
        }else{
            while(n != 0){
            int dig = n%10;
            arr.add(dig);
            
            n /= 10;
            }
        }

        Collections.sort(arr);
        prod = arr.get(arr.size() -1)*arr.get(arr.size() -2);

        return prod; 

    }
}