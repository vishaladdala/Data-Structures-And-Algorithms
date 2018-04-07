class Solution {
    public String customSortString(String S, String T) {
        
        int[] count = new int[26];
        
        for( char c : T.toCharArray()){
            
            count[c -'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char o : S.toCharArray()){
            
            for( int i = 0 ; i < count[o -'a']; i++){
                
               sb.append(o); 
            }
            count[o-'a'] = 0;
        }
        
        
        for( char c = 'a'; c<='z' ; c++){
            
            for(int i = 0; i<count[c-'a'];i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}