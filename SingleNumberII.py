'''
137. Single Number II
DescriptionHintsSubmissionsDiscussSolution
Pick One
Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

'''

class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dict = {}
        number = 0
        for num in nums:
            if num not in dict:
                dict[num]= 1
            else:
                dict[num]+=1
            
        for key in dict.keys():
            if dict[key] == 1:
                number = key
                
        return number
              