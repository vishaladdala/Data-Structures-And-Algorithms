class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length == 0){return false;}
         int rows = matrix.length;
         int columns = matrix[0].length;
         int start = 0;
         int end = rows*columns - 1;
         
         while(start <= end){
             int mid = start + (end-start)/2;
             int row = mid/columns;
             int col = mid%columns;
             
             int v = matrix[row][col];
             
             if(v == target){
                 return true;
             }
             
             if(v > target){
                 end = mid - 1;
             }
             else{
                 start = mid + 1;
             }
         }
         return false;
     }
         
     
 }