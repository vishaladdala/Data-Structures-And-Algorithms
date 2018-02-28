class Solution:
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) == 0:
            return True
        indexS = 0 
        indexT = 0
        
        
        while( indexT < len(t)):
            if( s[indexS] == t[indexT]):
                indexS += 1
                if(indexS == len(s)):
                    return True
            indexT += 1
            
        return False