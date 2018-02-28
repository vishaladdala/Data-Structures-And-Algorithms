class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        if(grid == null || grid.length==0){
            return 0;
        }
        
        int maxarea = 0;
        int area = 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                if(grid[i][j] == 1){
                    area = dfs(grid, i ,j);
                }
                
                maxarea = Math.max(maxarea,area);
            }
        }
        return maxarea;
        
    }
    
    
    public int dfs(int[][] grid, int row,int col){
        int rows = grid.length;
        int cols = grid[0].length;
      //  int area = 0;
        
        if(row<0 || col<0 || row>=rows || col>=cols || grid[row][col]== 0){
            return 0;
        }
        
    
        grid[row][col] = 0;
       // area++;
        
     //   dfs(grid,row-1,col);
      //  dfs(grid,row+1,col);
     //   dfs(grid,row,col-1);
      //  dfs(grid,row,col+1);
      return 1+ dfs(grid,row-1,col) + dfs(grid,row+1,col) + dfs(grid,row,col-1)+ dfs(grid,row,col+1);
    }
}