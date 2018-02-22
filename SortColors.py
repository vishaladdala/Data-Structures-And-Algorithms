'''
75. Sort Colors
DescriptionHintsSubmissionsDiscussSolution
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.


'''
class Solution:
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        memo = {0:0,1:0,2:0}
        
        for i  in  range (0,len(nums)):
            value = nums[i]
            memo[value] += 1
                
        zeroes = memo[0]
        ones = memo[1]
        twos = memo[2]
        s=0
       
        for i in range(zeroes):
            nums[s] = 0
            s+=1
            
        for j in range(ones):
            nums[s] = 1
            s+=1
            
        for k in range(twos):
            nums[s] = 2
            s+=1
                
        