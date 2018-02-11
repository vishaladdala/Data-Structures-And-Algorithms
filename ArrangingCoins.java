/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
*/

class ArrangingCoins {
    public int arrangeCoins(int n) {
        int remaining = n;
        int[] row = new int[n+1];
        int count = 0;
        
        if(n==0){return 0;}
        if( n<0){return -1;}
        row[0] = 0;
        
        
        for(int i = 1; i<=n; i++){
            remaining = remaining - i;
            if(remaining>=0){
              row[i] = i; 
              count++;
            }
            else{
             row[i] = remaining;
            }
            
        }
        return row[count];
        
    }
}