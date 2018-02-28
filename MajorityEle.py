class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dict ={}
        maj = len(nums)/2
        for num in nums:
            dict[num] = dict[num] + 1 if num in dict else 1
            if dict[num]> maj:
                return num
        