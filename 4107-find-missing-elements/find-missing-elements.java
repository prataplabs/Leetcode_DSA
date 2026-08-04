class Solution {
    public List<Integer> findMissingElements(int[] nums) {

     Arrays.sort(nums);   


      int sm = nums[0];
      int lar = nums[nums.length - 1];
      List<Integer> check = new ArrayList<>();
      for(int nu : nums){
        check.add(nu);
      }
      List<Integer> ans = new ArrayList<>();

      for(int i=sm ; i <= lar ;i++){
        if(!check.contains(i)){
            ans.add(i);
        }
      }

      Collections.sort(ans);


     return ans;
     
    }
}