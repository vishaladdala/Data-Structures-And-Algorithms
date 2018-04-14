def solution(A, B, C, D, E, F):
    # write your code in Python 3.6
    time = [A,B,C,D,E,F]
    time.sort()
    
    li = []
    
    #6th digit
    digit = max(time)
    li.append(digit)
    time.remove(digit)
    
    #5th digit
    fifth = 0
    for i in range(5):
        if time[i] > fifth and time[i] < 6:
            fifth = time[i]
    li.append(fifth)
    time.remove(fifth)
    
    #4th digit
    digit = max(time)
    li.append(digit)
    time.remove(digit)
    
    #3rd digit
    three = 0
    for i in range(3):
        if time[i] > three and time[i] < 6:
            three = time[i]
    li.append(three)
    time.remove(three)
    
    #2nd digit
    digit = max(time)
    li.append(digit)
    time.remove(digit)
    
    #1st digit
    digit = max(time)
    li.append(digit)
    time.remove(digit)
    
        
    print(li)
    print(time)
    
    if (li[-1]*10 + li[-2])>23:
        return -1
    
    return str(li[-1]) + str(li[-2]) + ':' + str(li[-3]) + str(li[-4]) + ':' + str(li[-5]) + str(li[-6])