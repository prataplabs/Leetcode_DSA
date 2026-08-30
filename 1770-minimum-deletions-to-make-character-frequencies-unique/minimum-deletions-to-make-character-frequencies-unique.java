class Solution {
    public int minDeletions(String s) {
         int[] freq = new int[26];
        
          for (char c : s.toCharArray()) {
            freq[c - 'a']++; 
        }

        Arrays.sort(freq);
        HashSet<Integer> used = new HashSet<>();
        int del = 0;

        for(int i=0 ;i<freq.length; i++){
            while(freq[i] > 0 && used.contains(freq[i])){

                del++;
                freq[i]--;
            }

            if(freq[i] > 0){
                used.add(freq[i]);
            }
        }

        return del;
    }
}