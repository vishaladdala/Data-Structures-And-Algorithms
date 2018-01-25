import java.util.Scanner;

public class SequenceWithSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//sc.nextInt();
		System.out.println("Enter the sum to generate sequence:");
		int sum = sc.nextInt();
		findContinuousSequence(sum);
		

	}
	
	static  void findContinuousSequence(int sum){
		if(sum<3){
			return;
		}
		
		int small = 1;
		int big = 2;
		
		int middle = (1+ sum)/2;
		int curSum = small + big;
		
		while(small<middle){
			if(curSum == sum){
				printSequence(small,big);
			}
			
			while( curSum > sum && small < middle){
				curSum -= small;
				++small;
				
				if(curSum == sum)
					printSequence(small,big);
			}
			++big;
			curSum += big;
			
		}
		
	}
	
	
	static void printSequence(int small, int big){
		for(int i = small; i<=big; i++){
			System.out.print(String.valueOf(i) + " ");
			System.out.println("");
		}
	}

}
