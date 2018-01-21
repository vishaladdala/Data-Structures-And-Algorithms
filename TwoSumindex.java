
public class TwoSumindex {
	public static void main(String args[]){
		int[] arr = {2,7,11,15};
		int sum = 9;
		int[] positions = twosum(arr,sum);
		if(positions[0]==-1 && positions[1]==-1){
			System.out.println("target sum cannot be found using this array");
		}
		else{
			System.out.println("target sum is:" + sum+ " present at indices: "+ positions[0] + " and " + positions[1]);
			
		}
		
	}
	
	 static int[] twosum(int[] array, int target){
		 int left = 0, right = array.length-1;
		 int[] none = {-1,-1};
		 while(left<right){
			 
			 if(array[left] + array[right] == target){
				 int[] index = {left,right};
				 return index;
				}
			 if(array[left] + array[right] < target){
			 left++;
			 }		
			 if(array[left] + array[right] > target){
				 right--;
				 }	
			
		 }
		 return none;
		 
		 
	 }

}
