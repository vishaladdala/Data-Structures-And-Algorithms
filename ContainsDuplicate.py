'''
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

'''
class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        dict={}
        for n in nums:
            if n not in dict:
                dict[n] = 1
            else:
                dict[n] += 1
            
        for n in nums:
            if dict[n] > 1:
                return True
            
        return False