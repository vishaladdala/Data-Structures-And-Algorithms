
public class MissisngElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,9};
		
		System.out.println(missing(arr));

	}
	
	
	public static int missingbruteforce(int[] array){
		int i = 1;
		
		while(i<=array.length){
			if(i == array[i-1]){
				i++;
			}
			else{
			
		 return i;
		 }
		}
		return -1;
	}
	
	public static int missing(int[] array){
		int sum = 0;
		for(int i =0 ; i< array.length; i++){
			sum += array[i];
		}
		
		int prod = (array[array.length-1] * (array[array.length-1]+1)/2);
		
		return prod - sum;
	}


}
