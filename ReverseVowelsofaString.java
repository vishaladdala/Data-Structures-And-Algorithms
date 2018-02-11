//ReverseVowelsofaString


class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        int left = 0;
        int right = str.length - 1;
        
        while(left<right){
            if(!vowels.contains(str[left])){
                left++;
            }
            else if(!vowels.contains(str[right])){
                right--;
            }
            else{
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(str);
        
    }
}