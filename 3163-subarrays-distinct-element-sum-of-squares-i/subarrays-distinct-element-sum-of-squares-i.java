class Solution {
    public int sumCounts(List<Integer> nums) {
       int count = 0;
       ArrayList<Integer> res = new ArrayList<>();

       for(int i=0 ; i<nums.size() ; i++){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j=i; j<nums.size() ; j++){
            if(!ans.contains(nums.get(j))){
                ans.add(nums.get(j));
                count++;
                res.add(count);
            }else{
                res.add(count);
            }
        }

        count = 0;
       }    

       int sum = 0;
       for(int i=0 ; i<res.size() ; i++){
        sum += res.get(i)*res.get(i);
       }   

       return sum;

    }
}