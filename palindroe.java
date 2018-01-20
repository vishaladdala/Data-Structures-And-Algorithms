public class palindrome {

    static boolean palchecker(String word) {
        char[] str = word.toCharArray();

        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            if (str[left] == str[right]) {
                left++;
                right--;
            } else if (str[left] != str[right]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]) {

        String str = "madam";
        String str2 = "indira";

        System.out.println(str + "  is a palindrme?" + palchecker(str));

        System.out.println(str2 + "  is a palindrme?" + palchecker(str2));
    }
}


