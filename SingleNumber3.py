'''
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
'''

class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        map ={}
        list=[]
        
        for i in nums:
            if i not in map:
                map[i]=1
            else:
                map[i]+=1
                
        for num in map.keys():
            if map[num] == 1:
                list.append(num)
                
        return list