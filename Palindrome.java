package Aykut;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str) {
        for (int i = 0; i < (str.length()/2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 -i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("'"+word + "' is palindrome: " + isPalindrome(word));

    }

}
