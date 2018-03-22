
class Solution {
    public void reverseWords(char[] str) {
        reverse(str,0,str.length-1);
        
       
        int j = 0;
        for(int i = 0; i < str.length-1; i++ ){
            if(str[i]!=' '){continue;}
            
            reverse(str,j,i-1);
            j=i+1;
            
        }
        
        reverse(str,j,str.length-1);
        
    }
    
    public void reverse( char[] str, int start, int end){
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}