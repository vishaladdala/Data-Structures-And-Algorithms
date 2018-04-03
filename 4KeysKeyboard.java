class Solution {
    public int maxA(int N) {
        
        int[] max = new int[N+1];
        
        for(int i = 1 ; i <= N ; i++){
            
            max[i] = max[i-1] + 1 ;
            
            for( int j = 0 ; j < i-1; j++){
                
                max[i] = Math.max( max[i], max[j] * (i-j-1));
                
            }
            
        }
        return max[N];
    }
}