
public class ReOrderArrayOddEven {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println("Array before reordering:");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		
		reorderoddeven(array);
		System.out.println("Array after reordering:");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+"  ");
		}

	}
	
	static void reorderoddeven(int[] array){
		//start with 2 pointers which will traverse in opposite directions
		int begin = 0;
		int end = array.length - 1;
		
		while(begin < end){
			//move begin forwards till it finds even number
			while(begin<end && (array[begin]%2!= 0)){
				begin++;
			}
			//move end backwards till it finds an odd number
			while(begin<end && (array[end]%2==0)){
				end--;
			}
			//swap begin and end to push evens to end of the array and odds to the beginning
			if(begin < end){
				int temp = array[begin];
				array[begin] = array[end];
				array[end] = temp;
			}
		}
	}

}
