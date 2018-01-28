package mergearrays;

public class mergesortedarrays {
	public static void main(String args[]){
		int[] arr1 = new int[7];
		arr1[0] = 1;arr1[1] = 3; arr1[2] = 5;//arr1[3] = 9;
		int[] arr2 = {2,4,6};
		
		merge(arr1,3,arr2,3);
		for(int i =0; i< arr1.length-1; i++){
			System.out.println(arr1[i]);
		}
	}
		
	

	static void merge(int[] array1, int length1, int[] array2,int length2){
		int index1,index2,indexmerged;
		index1 = length1 - 1;
		index2 = length2 - 1;
		indexmerged = length1 + length2 - 1;
		
		if(length1 < 1 || length2 < 1){
			return;
		}
		
		while(index1 >= 0 && index2 >= 0){
			if(array1[index1] >= array2[index2]){
				array1[indexmerged] = array1[index1];
				indexmerged--; index1--;
			}
			else{
				array1[indexmerged] = array2[index2];
				indexmerged--; index2--;
			}
		}
		while(index2 >= 0){
			array1[indexmerged] = array2[index2];
			indexmerged--;
			index2--;
		}
		
		
	}
}
