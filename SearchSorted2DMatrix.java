import java.util.*;
public class SearchSorted2DMatrix {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int rows = 3;
		int columns = 3;
		int[][] matrix = new int[rows][columns];
		
		//Initialising the matrix
		System.out.println("Enter the matrix elements in sorted ascending order:");
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		printMatrix(matrix);
		
		System.out.println("Enter the value to be searched:");
		int key = sc.nextInt();
		
		System.out.print(find(matrix,key));
		
	}
	
	static void printMatrix(int[][] matrix){
		int rows = matrix.length;
		int columns = matrix[0].length;
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns; j++){
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	static boolean find(int matrix[][], int value){
		int rows = matrix.length;
		int columns = matrix[0].length;
		int start = 0;
		int end = rows*columns - 1;
		
		while(start < end){
			int mid = start + (end-start)/2;
			int row = mid/columns;
			int col = mid%columns;
			
			int v = matrix[row][col];
			
			if(v == value){
				return true;
			}
			
			if(v > value){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		return false;
	}

}
