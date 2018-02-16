import java.util.Random;

public class Selection {

	public static void main(String[] args) {
	   int[] array = {-1,2,0};
	   
	   int number = selectkthlargest(array, 0 , array.length - 1, 1);
	   System.out.println(number);

	  /*
	   int n = partition(array,0,array.length-1);
	  // quicksort(array, 0, array.length - 1);
	   
	   for(int num:array){
		   System.out.println(num);
	   }
	   System.out.println("Pivot:"+ n);
		*/
	}
	
	
	public static int partition(int[] numbers, int start, int end) {
	    Random random = new Random();
	    int pivot = random.nextInt(end - start + 1) + start;
	    swap(numbers, pivot, end);
	    int small = start - 1;
	    for(int i = start; i <= end; ++i) {
	        if(numbers[i] < numbers[end]) {
	            ++small;
	            if(i != small)
	                swap(numbers, small, i);
	} }
	    ++small;
	    if(small != end)
	        swap(numbers, small, end);
	    return small;
	}

	public static void swap(int[] array,int index1,int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void quicksort(int[] numbers, int start, int end) {
	    if(start >= end)
	    	return;
	    	    int index = partition(numbers, start, end);
	    	    quicksort(numbers, start, index);
	    	    quicksort(numbers, index + 1, end);
	    	}
	
	public static  int selectkthlargest(int[] array, int start , int end, int k){
		int s  = 0;
		int e = array.length - 1;
		int kth = array.length - k;
		int index  = partition(array, s, e);
		if( kth < s || kth >e){return -1;}
		while(index != kth) {
	        if(index > kth) {
	            e = index - 1;
	            index = partition(array, s, e);
	        }
	        else {
	            s = index + 1;
	            index = partition(array, s, e);
	} }
		
		return array[index];
		
	}


}
