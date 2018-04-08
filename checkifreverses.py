#Function to check if two string are reverses of each other
def isReverse(string1 , string2):
    if(len(string1) != len(string2)):
        return False
    
    for i in range(len(string1)):
        j = len(string1) - i - 1
        
        if string1[i] != string2[j]:
            return False
    
    return True