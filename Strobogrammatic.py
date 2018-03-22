class Solution:
    def isStrobogrammatic(self, num):
        """
        :type num: str
        :rtype: bool
        """
        maps ={("0","0"),("1","1"),("6","9"),("8","8"),("9","6")}
        
        begin = 0
        end = len(num)-1
        
        while begin <= end:
            if (num[begin],num[end]) in maps:
                begin+=1
                end-=1
            else:
                return False
        return True
               