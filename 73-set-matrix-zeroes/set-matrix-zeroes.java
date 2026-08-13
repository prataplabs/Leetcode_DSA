class Solution {
    public void setZeroes(int[][] matrix) {
      int m = matrix.length;
      int n = matrix[0].length;

      boolean[] rows = new boolean[m];
      boolean[] colms = new boolean[n];


        for(int i=0 ; i < matrix.length ; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                  rows[i] = true;
                  colms[j] = true;

                    
                }
            }
        }

        for(int r=0 ; r<m ; r++){
            if(rows[r]){
                for(int j=0; j<n ; j++){
                    matrix[r][j] = 0;
                }
            }
        }

        for(int c=0 ; c<n ; c++){
            if(colms[c]){
                for(int j=0; j<m ; j++){
                    matrix[j][c] = 0;
                }
            }
        }
        
    }
}