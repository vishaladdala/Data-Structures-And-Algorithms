class Solution:
    def singleNonDuplicate(self, list):
        """
        :type nums: List[int]
        :rtype: int
        """
        low, high = 0 , len(list)-1
        while (low<high):
            mid = (int)(low + (high-low)/2)
            if (list[mid]!=list[mid+1] and list[mid]!=list[mid-1]):
                return list[mid]
            elif (mid%2 ==1 and list[mid]==list[mid-1]):
                low = mid+1
            elif (mid%2 ==0 and list[mid]==list[mid+1]):
                low = mid+1
            else:
                high = mid-1
        return list[low]