Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false


class Solution {
    public boolean judgeCircle(String moves) {
        char[] move = moves.toCharArray();
        int u=0;int d=0;int r=0;int l=0;
        for(int i = 0; i<move.length; i++){
            if(move[i] == 'U'){
                u++;
            }
             if(move[i] == 'D'){
                d++;
            }
             if(move[i] == 'R'){
                r++;
            }
             if(move[i] == 'L'){
                l++;
            }
        }
        
        if(u==d && r==l){
            return true;
        }
        return false;
    }
}