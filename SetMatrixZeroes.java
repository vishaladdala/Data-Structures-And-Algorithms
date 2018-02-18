class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        if(rows == 1 && cols == 1){return;}
        
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        
        
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
         
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
        
    }
 }
}}