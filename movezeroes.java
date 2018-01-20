package movezeroes;

public class movezeroes {
	public static void main(String args[]) {
		int [] arr = {1,2,3,0,4,0,5,0,6,0,0,7,8};
		print(arr);
		System.out.println();
		
		movezeroes(arr);
		
		print(arr);
	}
    
	
	static void movezeroes(int[] array) {
		int j= 0;
		for(int i =0; i<array.length; i++) {
			if(array[i] != 0) {
			   array[j] = array[i];
			   j = j+1;
			}
			

		}
		for(int k = j+1; k<array.length; k++) {
			array[k] = 0;
		}
		
	}
	
	
	static void print(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + "->");
		}
		System.out.print("NULL");
	}
}
