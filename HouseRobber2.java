/*
213. House Robber II
DescriptionHintsSubmissionsDiscussSolution
Pick One
Note: This is an extension of House Robber.

After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/

class HouseRobber2 {
    public int rob(int[] nums) {
      if(nums.length == 0){return 0;}
        
      if(nums.length == 1){return nums[0];}
         
      if(nums.length == 2){return Math.max(nums[0],nums[1]);}
        
      int[] memo1 = new int[nums.length+1];
      int[] memo2 = new int[nums.length+1];
        
        //Case 1: if we decide to rob the first house then need to remove the last house out of contention
        memo1[0]=0; memo1[1] = nums[0];
        for(int i = 2; i<=nums.length-1 ; i++){
            int value = 0;
            value = Math.max( memo1[i-1], nums[i-1] + memo1[i-2]);
            
            memo1[i] = value;
        }
        
        //Case 2: if we decide not to rob first house then we can start from second and try to rob the last house if neeeded
        memo2[0] = 0;
        memo2[1] = nums[1];
        
        for(int i = 2; i<=nums.length-1; i++){
            int val = 0;
            val = Math.max( memo2[i-1], nums[i] + memo2[i-2]);
            memo2[i] = val;
        }
        
     return Math.max(memo1[nums.length-1], memo2[nums.length-1]);   
        
    }
}