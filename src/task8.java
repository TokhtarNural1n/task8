/**
 * Checks if a given string consists only of digits.
 * @param s The string to check.
 * @return true if all characters in the string are digits, false otherwise.
 * Check each character of the string
 * If any character is not a digit, return false
 * If all characters are digits, return true
 * Check if the string consists only of digits
 * Output the result
 */

import java.util.Scanner;

public class DigitCheck {
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean result = isAllDigits(s);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

