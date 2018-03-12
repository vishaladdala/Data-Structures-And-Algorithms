class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     if (matrix.length == 0 || matrix[0].length == 0) {return false;}
     int row = matrix.length, col = matrix[0].length;
     if (matrix[row - 1][col - 1] < target || matrix[0][0] > target) {return false;}
     for (int i = 0; i < row; i++) {
         int lo = 0, hi = col - 1;
         while (lo <= hi) {
             int mid = lo + (hi - lo)/2;
             if (matrix[i][mid] == target) {return true;}
             else if (matrix[i][mid] > target) {hi = mid - 1;}
             else {lo = mid + 1;}
         }
     }
     return false;
 }
         
     
 }