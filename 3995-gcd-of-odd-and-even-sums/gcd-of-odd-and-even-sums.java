class Solution {
    public int gcdOfOddEvenSums(int n) {
        int count = 0;
        int sumodd = 0;
        int sumeven = 0;
        int i =1;
       while(count < n){
          sumodd += i;
          count++;
          i = i+2;
            
        }
        count = 0;
        int j = 2;
        while(count < n){
          sumeven += j;
          count++;
          j = j+2;
            
        }
        
        while(sumeven != 0){
            int rem = sumodd % sumeven;
            sumodd = sumeven;
            sumeven = rem;

        }

        return sumodd;
    }
}