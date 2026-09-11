class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(x + y < target){
            return false;
        }

        return target%gcd(x,y) == 0;
        
    }

    private int gcd(int a, int b){
        while(b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }

        return a;
    }
}