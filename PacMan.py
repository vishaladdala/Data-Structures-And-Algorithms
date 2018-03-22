def pacmanScore(grid):
    #
    # Write your code here.
    #
    if(len(grid) == 0 or len(grid[0]) == 0):
        return 0;
        
        
    for i in range (0,len(grid)):
        
        for j in range (0,len(grid[0])):
            
            if(i == 0 and j == 0) :
                continue;
            
            if(i == 0):
                grid[i][j] += grid[i][j - 1];
            
            elif(j == 0):
                grid[i][j] += grid[i - 1][j];
            
            else:
                grid[i][j] += max(grid[i - 1][j], grid[i][j - 1]);
        
    
    return grid[len(grid) - 1][len(grid[0]) - 1];