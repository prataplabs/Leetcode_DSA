class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int len = mat.length;

        for (int r = 0; r < 4; r++) {

            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
           

        for(int i=0; i<len ;i++){
            for(int j=i ; j<len ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0; i<len ;i++){
            for(int j=0 ; j<len/2 ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][len-1-j];
                mat[i][len-1-j] = temp;
            }
        }

        }

       

        return false;


        
    }
}