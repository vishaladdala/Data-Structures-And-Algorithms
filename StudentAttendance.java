/*
551. Student Attendance Record I

You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False
*/

class Solution {
    public boolean checkRecord(String s) {
        
        char[] str = s.toCharArray();
        
        int countA = 0 ;
        int maxcontL = 0;
        
        
        for(char a : str){
            if( a == 'A'){
                countA++;
            }
        }
        for(int i = 0; i < str.length; i++){
            if(str[i] == 'L'){
                if( maxcontL == 2){
                    return false;
                }
                else{
                    maxcontL++;
                }
                }
            else{
                    maxcontL = 0;
                }
        }
        
        if(countA > 1){
            return false;
        }
        
        return true;
        
    }
}