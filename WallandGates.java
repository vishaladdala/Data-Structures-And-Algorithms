class Solution {
    public void wallsAndGates(int[][] rooms) {
        
         int Empty = Integer.MAX_VALUE;
         int Gate = 0;
        
        List<int []> Directions = Arrays.asList(new int[]{1,0},
                                                new int[]{0,1},
                                                new int[]{-1,0},
                                                new int[]{0,-1});
        
        int rows = rooms.length;
        if(rows == 0 ){return;}
        int cols = rooms[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        
        for(int row = 0 ; row < rows; row++ ){
            for( int col = 0; col < cols; col++){
                if(rooms[row][col] == Gate){
                    queue.add(new int[]{row,col});
                }
            }
        }
        
        while( !queue.isEmpty()){
            int[] point = queue.poll();
            int r = point[0];
            int c = point[1];
            
            for( int[] dir : Directions){
                int R = r + dir[0];
                int C = c + dir[1];
                
                if(R < 0 || C < 0 || R >= rows|| C >= cols || rooms[R][C] != Empty){
                    continue;
                }
                
                rooms[R][C] = rooms[r][c] + 1;
                
                queue.add(new int[] {R,C});
            }
            
            
        }
        
        
        
        
    }
}