#Given a configuration of rooks as a list of lists return whether they are attacking each other
chessboard = [[1,0,0,0],[0,1,0,0],[0,0,1,0],[0,0,0,1]]


def Are_Rooks_Safe(chessboard):
    rows = cols = len(chessboard)
    
    rowcount = 0
    colcount = 0
    
    for i in range(rows):
        rowcount = 0
        for j in range(cols):
            if(chessboard[i][j]) == 1:
                rowcount += 1
        if rowcount > 1:
            return False
        
        
    for i in range(cols):
        colcount = 0
        for j in range(rows):
            if(chessboard[j][i] == 1):
                colcount += 1
        if colcount > 1:
            return False
        
    return True

