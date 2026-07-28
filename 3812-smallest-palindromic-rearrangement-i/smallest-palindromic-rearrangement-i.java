class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        // int n = s.length();
        // boolean isOdd = false;
        // if(s.length()%2 != 0){
        //     isOdd = true;
        // }
        // ArrayList<Character> ans = new ArrayList<>();
        // for(int i=0; i<s.length() ; i++){
        //     char c = s.charAt(i);
        //     ans.add(c);

        // }
        // Collections.sort(ans);

        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();

        // if(isOdd){
        //     for(int i=0; i< ans.size() - 1 ; i = i+2){
        //         sb1.append(ans.get(i));
        //         sb2.append(ans.get(i+1));
        //     }

        //     sb1.append(ans.get(ans.size() -1 ));
        //     sb1.append(new StringBuilder(sb2).reverse() );

            
        // }else{
        //      for(int i=0; i< ans.size() - 1 ; i = i+2){
        //         sb1.append(ans.get(i));
        //         sb2.append(ans.get(i+1));
        //     }

        //      sb1.append(new StringBuilder(sb2).reverse() );

        // }

        // return sb1.toString();

         ArrayList<Character> ans = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            ans.add(ch);
        }

        Collections.sort(ans);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        int i = 0;

        while (i < ans.size()) {

            char ch = ans.get(i);
            int cnt = 0;

            while (i < ans.size() && ans.get(i) == ch) {
                cnt++;
                i++;
            }

            for (int j = 0; j < cnt / 2; j++) {
                sb1.append(ch);
            }

            if (cnt % 2 == 1) {
                mid.append(ch);
            }
        }

        return sb1.toString() + mid.toString() + new StringBuilder(sb1).reverse().toString();
        
    }
}