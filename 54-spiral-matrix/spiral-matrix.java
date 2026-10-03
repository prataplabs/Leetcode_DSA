class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int srow = 0;
        int scol = 0;
        int endr = matrix.length-1;
        int endc = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();

        while(srow <= endr && scol <= endc ){
            for(int j=scol ; j<= endc ; j++ ){ //top
              ans.add(matrix[srow][j]);
            }

            for(int i = srow+1; i <= endr ; i++){
                ans.add(matrix[i][endc]);
            }//right

            for(int j=endc-1; j >= scol ; j--){//bottom
                if(srow == endr){
                    break;
                }
                ans.add(matrix[endr][j]);
            }

            for(int i=endr-1; i >= srow+1 ; i-- ){
                if(scol == endc){
                    break;
                }
                ans.add(matrix[i][scol]);
            }

            srow++;
            scol++;
            endr--;
            endc--;
        }

        return ans;

        
    }
}