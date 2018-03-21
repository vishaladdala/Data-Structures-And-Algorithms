class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        for i in range(len(digits)-1, -1, -1):
            if digits[i]<9:
                digits[i]+=1
                return digits
            digits[i] = 0
            
        new_number = [0]*(len(digits)+1)
        new_number[0] = 1
        
        return new_number