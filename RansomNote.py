'''
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
'''

class Solution:
    def canConstruct(self, ransomNote, magazine):
        
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        dict = {}
        for c in magazine:
            if c not in dict:
                dict[c] = 1
            else:
                dict[c] += 1
            
        for s in ransomNote:
            if(s not in dict or dict[s] == 0):
                return False
            if (dict[s] > 0):
                dict[s] -= 1
            
            
        return True