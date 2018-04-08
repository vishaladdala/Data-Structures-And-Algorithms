#Design a firewall
#Given a list of list of IP ranges blocked 
#return min ip address not blocked
# ip ranges from 0 to max ip given

blocked = [[0,3],[4,6],[8,10],[11-18]]
minIP = None

def MinIPNotBlocked(listoflists,MaxIP):
    blockedIP = []
    minIP = None
    for i in range(len(listoflists)):
        for j in range( listoflists[i][0], listoflists[i][len(listoflists[i])-1]+1):
            blockedIP.append(j)
    blockedset = set(blockedIP)
            
    for i in range(MaxIP+1):
        if i not  in blockedIP:
            minIP = i
            break
    return minIP
        