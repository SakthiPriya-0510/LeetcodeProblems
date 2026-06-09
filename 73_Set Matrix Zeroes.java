class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i,j;
        boolean firstrow=false, firstcol=false;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[0][j]==0){
                    firstrow=true;
                }
            }
        }

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[i][0]==0){
                    firstcol=true;
                }
            }
        }

        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstrow){
            for(j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(firstcol){
            for(i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }

    }
}
