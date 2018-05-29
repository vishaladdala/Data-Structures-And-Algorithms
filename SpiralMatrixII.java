class Solution {
    public int[][] generateMatrix(int n) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        for( int i = 1 ; i <= n*n; i++){
            queue.add(i);
        }
        
        int[][] matrix = new int[n][n];
        
        int r1 = 0, r2 = n-1;
        int c1 = 0, c2 = n-1;
        
       // while(!queue.isEmpty()){System.out.println(queue.poll());}
        
        while( r1 <= r2 && c1 <= c2 ){
            //1st row
            for(int c = c1; c <= c2; c++){matrix[r1][c] = queue.poll();}
            
            //last col
            for(int r = r1+1; r<=r2;r++){matrix[r][c2] = queue.poll();}
            
            //last row and first col
            if( r1 < r2 && c1 < c2 ){
                
                for(int c = c2-1; c >c1; c--){matrix[r2][c] = queue.poll();}
                
                for(int r = r2; r >r1; r--){matrix[r][c1] = queue.poll();}
                
            }
            
            r1++;
            c1++;
            r2--;
            c2--;
            
        }
        
        return matrix;
    }
}