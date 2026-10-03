class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int srow = 0;
        int scol = 0;
        int endr = ans.length-1;
        int endc = ans[0].length-1;
        int add = 1;

        while(srow <= endr && scol <= endc ){
            for(int j=scol ; j<= endc ; j++ ){ //top
              ans[srow][j] = add++ ;
              
            }

            for(int i = srow+1; i <= endr ; i++){
                ans[i][endc] = add++;
                
            }//right

            for(int j=endc-1; j >= scol ; j--){//bottom
                if(srow == endr){
                    break;
                }
                ans[endr][j] =  add++;
               
            }

            for(int i=endr-1; i >= srow+1 ; i-- ){
                if(scol == endc){
                    break;
                }
                ans[i][scol] = add++;
                
            }

            srow++;
            scol++;
            endr--;
            endc--;
        }

        return ans;

        
    }
}