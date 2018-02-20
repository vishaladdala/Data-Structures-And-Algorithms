'''
128. Longest Consecutive Sequence
DescriptionHintsSubmissionsDiscussSolution
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
'''
class Solution:
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        hashset = set(nums)
        
        
        maxstreak = 0
        currentstreak = 0
        
        for num in hashset:
            if num-1 not in hashset:
                currentstreak = 1
                while num+1 in hashset:
                    currentstreak += 1
                    num+=1
                    
            if(currentstreak > maxstreak):
                maxstreak = currentstreak
                
        return maxstreak
                    
        