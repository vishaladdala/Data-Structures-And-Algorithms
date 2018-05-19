/*
209. Minimum Size Subarray Sum
DescriptionHintsSubmissionsDiscussSolution
Pick One
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
Companies 
Facebook
Related Topics 
ArrayTwo PointersBinary Search
Similar Questions 
Minimum Window SubstringMaximum Size Subarray Sum Equals kMaximum Length of Repeated Subarray
Example: 

Input: [2,3,1,2,4,3], s = 7
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
Follow up:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 
*/
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0){return 0;}
        int start = 0, end = 0;
        
        int sum = 0;
        int minsubsize = Integer.MAX_VALUE;
        
        while(end < nums.length){
            
            sum+=nums[end];
             end++;
           /* if(sum >= s){
                minsubsize = Math.min(minsubsize,end-start);
            }*/
            //end++;
            while(sum >= s){
                minsubsize = Math.min(minsubsize,end-start);
                sum -= nums[start];
                start++;
            }
            
            
        }
        
        return minsubsize==Integer.MAX_VALUE ? 0 : minsubsize;
    }
}