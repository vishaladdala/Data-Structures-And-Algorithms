package power;

public class power {

	public static void main(String[] args) {
		System.out.print(pover(3,1));
		
	}

	
	 static int pover(int number, int pow) {
		
		if(pow == 0) {
			return 1;
		}
		
		if(pow == 1) {
			return number;
		}
		
		int prod = 1;
		while(pow>0) {
			prod *= number;
			pow--;
		}
		return prod;
	}

}
