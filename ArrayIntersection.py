#Given two arrays, write a function to compute their intersection.

#Example:
#Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

#Note:
#Each element in the result should appear as many times as it shows in both arrays.
#The result can be in any order.

class Solution:
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        dict ={}
        
        intersect = []
        
        
        for i in nums1:
            if i not in dict:
                dict[i] = 1
            else:
                dict[i] = dict[i] + 1
                
        for j in nums2:
            if j in dict and dict[j]>0:
                intersect.append(j)
                dict[j] = dict[j] - 1
                
        return intersect