class Solution {
    public void rotate(int[] nums, int k) {
       k = k%nums.length;
       ArrayList<Integer> temp = new ArrayList<>();

       for(int i=0; i<nums.length-k ; i++){
        temp.add(nums[i]);


       }

       int j=0;

       for(int i=nums.length-k ; i<nums.length; i++){
        nums[j] = nums[i];
        j++;
       }

       int l=0; 
       for(int i=k; i<nums.length; i++){
        nums[i] = temp.get(l);
        l++;
       }

        
    }
}