'''
3. Longest Substring Without Repeating Characters
DescriptionHintsSubmissionsDiscussSolution
Pick One
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
'''

class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if(len(s) == 0):
            return 0
        
        if(len(s) == 1):
            return 1
        
        if(len(s) == 2):
            if(s[0] != s[1]):
                return 2
            else:
                return 1
        currentstreak = 1
        maxstreak = 1
        
        for i in range (0,len(s)-1):
            a = set()
            a.add(s[i])
            currentstreak = 1
            
            for j in range(i+1, len(s)):
                if s[j] not in a:
                    a.add(s[j])
                    currentstreak += 1
                    
                else:
                    break
                    
            if ( currentstreak > maxstreak):
                maxstreak = currentstreak
                
        return maxstreak
        
        
        