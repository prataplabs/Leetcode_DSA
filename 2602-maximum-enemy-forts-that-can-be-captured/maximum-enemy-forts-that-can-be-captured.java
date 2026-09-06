class Solution {
    public int captureForts(int[] forts) {
        int max = 0;

        for (int i = 0; i < forts.length; i++) {

            if (forts[i] == 1 || forts[i] == -1) {

                int j = i + 1;
                int count = 0;

                while (j < forts.length && forts[j] == 0) {
                    count++;
                    j++;
                }

                if (j < forts.length && forts[i] != forts[j]) {
                    max = Math.max(max, count);
                }
            }
        }

        return max;
    }
}