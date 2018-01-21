
public class TwoSum {
	public static void main(String args[]){
		int[] arr = {2,7,11,15};
		int sum = 9;
		System.out.println("target sum is:" + sum+ " Is it present? "+ twosum(arr,sum));
		
	}
	
	 static boolean twosum(int[] array, int target){
		 int left = 0, right = array.length-1;
		 while(left<right){
			 if(array[left] + array[right] == target){
				 return true;
				}
			 if(array[left] + array[right] < target){
			 left++;
			 }		
			 if(array[left] + array[right] > target){
				 right--;
				 }	
			
		 }
		 return false;
		 
		 
	 }

}
