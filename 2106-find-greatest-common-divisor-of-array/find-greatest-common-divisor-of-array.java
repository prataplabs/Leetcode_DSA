class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int lar = nums[0];
      

        for(int num : nums){
            if(num < smallest){
                smallest = num;
            }else if(num > lar){
                lar = num;
            }
        }

        int a = smallest;
        int b = lar;
        while(b!= 0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
        
     
    }
}