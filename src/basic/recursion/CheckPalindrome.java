package basic.recursion;

public class CheckPalindrome {
    /**
     * Recursive function
     */
    public static int isNumberPalindrome(int number, int reverseNumber) {
        if (number == 0) {
            return reverseNumber;
        }
        int remainder = number % 10;
        reverseNumber = (reverseNumber * 10) + remainder;
        return isNumberPalindrome(number / 10, reverseNumber);
    }

    public static boolean isPalindrome(int number) {
        int sum = 0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            sum = (sum * 10) + remainder;
        }
        return originalNumber == sum;
    }
}