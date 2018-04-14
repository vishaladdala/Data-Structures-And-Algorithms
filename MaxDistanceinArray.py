class Solution:
    def maxDistance(self, arrays):
        """
        :type arrays: List[List[int]]
        :rtype: int
        """
        minimum = arrays[0][0]
        maximum = arrays[0][len(arrays[0])-1]
        maxdif = 0
        
        
        for i in range(1, len(arrays)):
            maxdif = max(maxdif, max( abs(arrays[i][len(arrays[i])-1] - minimum)  ,  abs(maximum - arrays[i][0] ) ))
                                                    
            minimum = min(minimum, arrays[i][0] )
                                                    
            maximum = max(maximum, arrays[i][len(arrays[i])-1])
                         
        return maxdif
        