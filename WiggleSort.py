class Solution:
    def wiggleSort(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        list.sort(nums)
        
        for i in range(1,len(nums)-1,2):
            j = i + 1
            nums[i], nums[j] = nums[j], nums[i]
            