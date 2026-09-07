class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        int n = arr.length;

        
        int g = gcd(n, k);

        long ans = 0;

        for (int start = 0; start < g; start++) {

            ArrayList<Integer> list = new ArrayList<>();

            
            for (int i = start; i < n; i += g) {
                list.add(arr[i]);
            }

            
            Collections.sort(list);

            int median = list.get(list.size() / 2);

          
            for (int value : list) {
                ans += Math.abs((long) value - median);
            }
        }

        return ans;
        
    }

     private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}