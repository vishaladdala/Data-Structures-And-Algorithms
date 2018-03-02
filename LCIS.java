class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        int streak = 1;
        int currstreak;
        
        
        for(int i = 0; i < nums.length-1; i++){
            currstreak = 1;
            for( int j = i+1; j < nums.length; j++){
                if(nums[j]<=nums[j-1])break;
                
                if(nums[j] > nums[j-1]){
                    currstreak++;
                }
            }
            
            streak = Math.max(streak,currstreak);
        }
        
     return streak;   
        
    }
}