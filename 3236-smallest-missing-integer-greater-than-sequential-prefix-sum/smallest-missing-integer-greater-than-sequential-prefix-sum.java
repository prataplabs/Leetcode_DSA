class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1; i < nums.length; i++){
            if(nums[i] == nums[i-1] +1 ){
                sum += nums[i];
            }else{
                break;
            }

        }

        HashSet<Integer> ans = new HashSet<>();

        for(int n : nums){
            ans.add(n);

        }

        while(ans.contains(sum) ){
            sum++;
        }

        return sum;

        
    }
}