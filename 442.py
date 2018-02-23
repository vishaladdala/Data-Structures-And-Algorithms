'''
442. Find All Duplicates in an Array
DescriptionHintsSubmissionsDiscussSolution
Pick One
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
'''
class Solution:
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        dict={}
        list=[]
        for i in nums:
            if i not in dict:
                dict[i] = 1
                
            else:
                dict[i]+=1
                
        for i in dict.keys():
            if dict[i] == 2:
                list.append(i)
                
        return list
                