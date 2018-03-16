import java.util.Scanner;

public class Coins_DP {
	
	 static int getWays(int n, int[] c){
	       int[] memo = new int[n+1];
	        memo[0] = 1;
	        
	        for(int coin : c){
	            for(int i = 1; i < memo.length; i++){
	                if(i>=coin){
	                    memo[i] += memo[i-coin];
	                }
	            }
	        }
	        return memo[n];
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] c = new int[m];
	        for(int c_i=0; c_i < m; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
	        int ways = getWays(n, c);
	        
	        System.out.println(ways);
	    }

}
