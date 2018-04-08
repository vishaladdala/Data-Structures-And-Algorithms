#li = [1,3,4,5,0,2]


def secondLargest(listofnumbers):
    maxno1 = None
    maxno2 = None
    
    for current in listofnumbers:
        if maxno1 == None:
            maxno1 = current
        elif current >  maxno1:
            maxno2 = maxno1
            maxno1 = current
        elif maxno2 == None:
            maxno2 = current
        elif current > maxno2:
            maxno2 = current
            
    return maxno2


#secondLargest(li)

#4


#newli = [2]

#print(secondLargest(newli))
#None

#li2 = [1,2,2]

#secondLargest(li2)
#2