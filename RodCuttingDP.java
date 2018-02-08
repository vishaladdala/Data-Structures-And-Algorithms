
public class RodCuttingDP {

	public static void main(String[] args) {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
		int length = prices.length;
		
		System.out.println("Max profit: " + rodcutter(prices,length) + " for a rod of length " + length);

	}

	public static int rodcutter(int[] prices, int length){
		int[] memo = new int[length+1];
		
		memo[0] = 0;
	   
		for(int i = 1; i<=prices.length; i++){
			int value = 0;
			
			for(int j = 0; j<i; j++){
				value = Math.max(value, prices[j] + memo[i-j-1]);
				
				memo[i] = value;
			}
			
		}
		
		return memo[length];
	}
	
}
