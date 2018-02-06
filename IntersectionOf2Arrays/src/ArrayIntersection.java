import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] array1 = {4,2,3,1,5,6,7,8,7,9};
		int[] array2 = {2,4,5,7,11,8,23,7,21,11};
		
		int[] array3 = intersection(array1, array2);
		
		for(int i = 0; i < array3.length;i++){
			System.out.print(array3[i] + " ");
		}

	}
	
	public static int[] intersection(int[] arr1, int[] arr2){
		HashSet<Integer> set = new HashSet<>();
	    Arrays.sort(arr2);
		for(Integer n:arr1){
			if (binarysearch(n,arr2)) {
                set.add(n);
            }
		}
		int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i] = num;
            i++;
        }
        return result;
		
		
		
		
	}
	
	public static boolean binarysearch(int num ,int[] array){
		int low = 0;
		int high = array.length-1;
		
		//int mid = low + (high - low)/2;
		while(low<high){
			int mid = low + (high - low)/2;
		if(array[mid]==num){
			return true;
		}
		else if(array[mid]<num){
			low = mid+1;
		}
		else if(array[mid]>num){
			high  = mid-1;
		}
		}
		return false;
	}

}
