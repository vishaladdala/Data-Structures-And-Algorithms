/*
given a string of number we need to return the integer
the string may begin with spaces and we need to ignore them
in addition the string may contain + or - signs before the number
taking these into account we do the traditional:
while i to the end of string:
num = num*10 + i 
*/


class AtoI {
    public int myAtoi(String str) {
         if (str.isEmpty()){
             return 0;
         }
    int sign = 1, base = 0, i = 0;
    while (str.charAt(i) == ' '){
        i++;
    }
    if (str.charAt(i) == '-' || str.charAt(i) == '+'){
        sign = str.charAt(i) == '-' ? -1 : 1;
        i+=1;
    }
    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        base = 10 * base + (str.charAt(i) - '0');
        i+=1;
    }
    return base * sign;
        
    }
}