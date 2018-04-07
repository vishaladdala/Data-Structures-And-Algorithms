class Solution {
    public String nextClosestTime(String time) {
        
        int currtime = Integer.parseInt(time.substring(0,2)) * 60;
        currtime += Integer.parseInt(time.substring(3));
        
        HashSet<Integer> set  = new HashSet<>();
        
        for( char c : time.toCharArray()){
            if( c != ':'){
                set.add(c - '0');
            }
        }
        
        
        while( true ){
            currtime = (currtime + 1) % (24*60);
            
            int[] digits = new int[]{currtime/60/10, currtime/60%10, currtime%60/10,currtime%60%10};
            
            search:
            {
                for( int d : digits){
                    if( !set.contains(d)){break search;}
                    
                }
                
               return String.format("%02d:%02d", currtime / 60, currtime % 60); 
            }
        }
        
        
    }
}