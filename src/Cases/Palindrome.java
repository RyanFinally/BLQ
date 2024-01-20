package Cases;

import static Util.Input.inputString;

/**
 * Tanpa menggunakan fungsi Reverse, buatlah fungsi untuk menentukan apakah sebuah kata adalah palindrome* atau tidak
 * *Palindrome adalah kata yang jika dibalik tetap sama, contohnya “katak”, “12021”, “malam”
 *
 */

public class Palindrome {
    public static void main(String[] args) {
//        String input = "katak";
        String input = inputString();
        isPalindrome(input);
    }

    private static boolean casePalindrome(String input){
        String cleanedString = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = cleanedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void isPalindrome(String input){
        if(casePalindrome(input)){
            System.out.println(input + " is Palindrome");
        }else {
            System.out.println(input + " is not Palindrome");
        }
    }
}
