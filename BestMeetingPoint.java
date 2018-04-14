class Solution {
    public int minTotalDistance(int[][] grid) {
        
        List<Integer> rows = collectRows(grid);
        List<Integer> cols = collectCols(grid);
        
        int rowpt = rows.get(rows.size()/2);
        int colpt = cols.get(cols.size()/2);
        
        return OneDdistance(rows , rowpt) + OneDdistance(cols , colpt);
        
    }
    
    public static int OneDdistance(List<Integer> points , int point){
        int distance = 0;
        for( int pt : points){
            distance += Math.abs(pt - point);
        }
        
        return distance;
    }
    
    public static List<Integer> collectRows(int[][] grid){
        
        List<Integer> rows = new ArrayList<Integer>();
        
        for(int i = 0 ; i < grid.length; i++){
            for( int j = 0 ; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    rows.add(i);
                }
            }
        }
        return rows;
    }
    
    public static List<Integer> collectCols(int[][] grid){
        
        List<Integer> cols = new ArrayList<Integer>();
        
        for(int i = 0 ; i < grid[0].length; i++){
            for( int j = 0 ; j < grid.length; j++){
                if(grid[j][i] == 1){
                    cols.add(i);
                }
            }
        }
        return cols;
    }
}