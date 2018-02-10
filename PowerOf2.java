class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 0 || n<0){return false;}
        
        if(n==1){return true;}
        int number = 1;
        while(number != n && number<=n ){
            
           number *= 2;
            
        }
        
        if(number == n){return true;}
        return false;
        
    }
}

//Alternatively

public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }
}