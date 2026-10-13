class Solution {
    public long maxAlternatingSum(int[] nums) {
        // ArrayList<Integer> lef = new ArrayList<>();
        // ArrayList<Integer> rig = new ArrayList<>();
        // ArrayList<Integer> temp = new ArrayList<>();
        
        // for(int i=0 ;i<nums.length ; i++){
        //     temp.add(Math.abs(nums[i]));
        // }

        // Collections.sort(temp);
        // int i = 0;
        // int j = temp.size() -1;

        // while(j >= i){
        //     rig.add(temp.get(j));
        //     j--;
        //     lef.add(temp.get(i));
        //     i++;
        // }

        //  i = 0;
        //  j = 0;
        // long ans = 0;
        // while(i < lef.size() && j < rig.size()){
        //    ans += rig.get(j)*rig.get(j) - lef.get(i)*lef.get(i);
        //    i++;
        //    j++;
        // }

        // while(i < lef.size()){
        //     ans -=   lef.get(i)*lef.get(i);
        //     i++;
        // }

        //  while(j < rig.size()){
        //     ans = ans + rig.get(j)*rig.get(j);
        //     j++;
        // }

        // return ans;
       
       int n = nums.length;
       long[] sq = new long[n];
       
       for(int i=0; i<n ; i++){
        long val = nums[i];
        sq[i] = val*val;
       }

       Arrays.sort(sq);

       long sum = 0;
       int k = n/2;

       for(int i=0; i<k ; i++){
        sum -= sq[i];       
        }

        for(int i=k; i<n ; i++){
            sum += sq[i];
        }

        return sum;



    }
}