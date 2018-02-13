/*
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/

class Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        
        int col_number = 0;
        
        for(int i = 0; i<s.length(); i++){
            col_number = col_number * 26 + (s.charAt(i) - 'A' + 1);
        }
        
        return col_number;
        
    }
}