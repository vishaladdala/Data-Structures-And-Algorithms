/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/

class HouseRobber {
    public int rob(int[] nums) {
        
      if(nums.length == 0){return 0;}
        
      if(nums.length == 1){return nums[0];}
        
        
      int[] memo = new int[nums.length+1];
        
        memo[0] = 0;
        memo[1] = nums[0];
        int value;

        for(int i = 2 ; i <= nums.length; i++){
            value = 0;
            value = Math.max(memo[i-1], nums[i-1] + memo[i-2]);
            
            memo[i] = value;
        }
        return memo[nums.length];
}}