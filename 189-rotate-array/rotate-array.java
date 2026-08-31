class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i< nums.length-k; i++){
            arr.add(nums[i]);
        }        
        int j = 0;
        for(int i=nums.length-k ; i <nums.length; i++){
            if(nums.length > k){
                
            int temp = nums[i];
            nums[j] = temp;
            j++;
            
            }
            
        }
        int l =0;
        for(int i = k ; i<nums.length; i++){
          nums[i] = arr.get(l);
          l++;
        }

        
    }
}