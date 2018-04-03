class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> spiral = new ArrayList<>();
        
        if( matrix.length == 0){return spiral;}
        
        int r1 = 0;
        int r2 = matrix.length - 1;
        
        int c1 = 0;
        int c2 = matrix[0].length - 1;
        
        
        while( r1<=r2 && c1<=c2){
            //first row
            for(int i = c1; i <= c2; i++){ spiral.add(matrix[r1][i]);}
            
            //last column
            for(int j = r1+1; j<=r2; j++){ spiral.add(matrix[j][c2]);}
            
            if( r1 < r2 && c1 < c2){
                //lastrow
                for( int k = c2-1; k > c1; k--){ spiral.add(matrix[r2][k]);}
                
                //first column
                
                for( int l = r2; l>r1; l--){ spiral.add(matrix[l][c1]);}
                
                
            }
            
            
            r1++;
            c2--;
            r2--;
            c1++;
            
            
        }
        
        
        return spiral;
}
}