
public class CountSort {

	public static void main(String[] args) {
		int[] ages = {23,1,22,56,45,34,67,45,84,34,75,34,24,22,1,2,2,4,2,6,4,3,7,8,4,3,6,7,34,72};
		countSort(ages);
		
		
		for(int i = 0; i< ages.length; i++){
			System.out.print(ages[i]+ " ");
		}

	}
	
	static void countSort(int ages[]){
		int oldestAge = 99;
		int timesOfAge[] = new int[oldestAge + 1];
		
		for(int i = 0 ; i < oldestAge; ++i){
			timesOfAge[i] = 0;
		}
		
		for(int i = 0; i < ages.length; ++i){
			int age = ages[i];
			
			if(age < 0 || age > oldestAge)
				throw new IllegalArgumentException("Out of Range");
			++timesOfAge[age];
		}
		
		int index = 0;
		for(int i = 0; i<= oldestAge; ++i){
			for(int j = 0; j<timesOfAge[i]; ++j){
			ages[index] = i;
			++index;
			}
		}
	}

}
