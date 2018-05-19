class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        
        int start =0 , end = 0, counter = 0, len = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        while( end < s.length()){
            
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0)+1);
            
            if(map.get(c) == 1){counter++;}
            
            end++;
            
            while(counter > 2){
                char ctemp = s.charAt(start);
                map.put(ctemp, map.get(ctemp) -1);
                
                if( map.get(ctemp) == 0){
                    counter--;
                }
                start++;
            }
            
            len = Math.max(len, end - start);
        }
        
        return len;
    }
}