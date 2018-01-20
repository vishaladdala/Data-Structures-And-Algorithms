
public class Duplicates {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,4,5,6,6,6,6,7,8,9,9};
		int n = duplicate(arr);
		System.out.println("The number of duplicates:" + n);
	}
	
   static int duplicate(int[] array) {
	   int j = 0;
	   
	   for(int i =0; i < array.length -1; i++) {
		   
		   if(array[i] != array[i+1]) {
			   array[j] = array[i];
			   j=j+1;
		}}
		   for(int z = 0; z<j; z++) {
			   System.out.println(array[z]);
		   }
		   
		   return (array.length-1 - j);
		   
		   
	   }
   }


