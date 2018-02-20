'''
229.Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
'''

class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        dict ={}
        list=[]
        
        for n in nums:
            if n not in dict:
                dict[n] = 1
            else:
                dict[n] +=1
                
        occurence = len(nums)/3
        
        for i in dict.keys():
            if dict[i]>occurence:
                list.append(i)
        
        return list