from extratypes import Point2D  # library with types used in the task

def solution(A):
    # write your code in Python 3.6
    #print(A[0].x)
    #print(A[0].y)
    
    #print(len(A))
    
    quadrant1 = []
    quadrant2 = []
    quadrant3 = []
    quadrant4 = []
    
    for i in range(len(A)):
        if A[i].x > 0 and A[i].y > 0:
            quadrant1.append(A[i])
        elif A[i].x < 0 and A[i].y > 0:
            quadrant2.append(A[i])
        elif A[i].x < 0 and A[i].y < 0:
            quadrant3.append(A[i])
        elif A[i].x > 0 and A[i].y < 0:
            quadrant4.append(A[i])
            
    #print(quadrant1)
    
    rays = 0
    
    #rays for 1st quadrant
    slope1 = []
    for i in range(len(quadrant1)):
        slope = quadrant1[i].y / quadrant1[i].x
        if slope not in slope1:
            rays+=1
        slope1.append(slope)
        
    #rays for 2nd quadrant
    slope2 = []
    for i in range(len(quadrant2)):
        slope = quadrant2[i].y / quadrant2[i].x
        if slope not in slope2:
            rays+=1
        slope2.append(slope)
        
    #rays for 3rd quadrant
    slope3 = []
    for i in range(len(quadrant3)):
        slope = quadrant3[i].y / quadrant3[i].x
        if slope not in slope3:
            rays+=1
        slope3.append(slope)
        
    #rays for 4th quadrant
    slope4 = []
    for i in range(len(quadrant4)):
        slope = quadrant4[i].y / quadrant4[i].x
        if slope not in slope4:
            rays+=1
        slope4.append(slope)
        
        
    
        
    
    return rays