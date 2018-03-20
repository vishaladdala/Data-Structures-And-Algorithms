class Solution:
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        out = [1]*len(nums)
        prod = 1
        for i in range(len(nums)):
            out[i] *= prod
            prod *= nums[i]
        prod = 1    
        for i in range( len(nums)-1, -1,-1):
            out[i] *= prod
            prod *= nums[i]
        
        
        return out