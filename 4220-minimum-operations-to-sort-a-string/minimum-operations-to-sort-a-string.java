class Solution {
    public int minOperations(String s) {
        // int n = s.length();
        // int count = 0;

        // StringBuilder sb = new StringBuilder(s);

        // for(int i=1 ; i<sb.length() ; i++){
        //     char c = sb.charAt(i);
        //     char prev = sb.charAt(i-1);

        //     if(c-'a' < prev - 'a'){
        //         if(n <= 2){
        //             return -1;
        //         }

        //         sb.setCharAt(i - 1, c);
        //         sb.setCharAt(i, prev);

        //         count++;
        //     }
            
        // }

        // return count;

        int n = s.length();

        boolean sorted = true;
        char min = s.charAt(0);
        char max = s.charAt(0);

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);

            if (c < s.charAt(i - 1)) {
                sorted = false;
            }

            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        if (sorted) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }

        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            char c = s.charAt(i);

            if (c == min || c == max) {
                return 2;
            }
        }

        return 3;
        
    }
}