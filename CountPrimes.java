class CountPrimes {
    public int countPrimes(int n) {
        boolean[] NotPrime  = new boolean[n];
        int count = 0;
        
        for(int i =2; i<n; i++){
            if( NotPrime[i] == false){
                count++;
            }
            
            for(int j = 2; i*j<n; j++){
              NotPrime[i*j] = true;  
            }
        }
        
        return count;
        
    }
}