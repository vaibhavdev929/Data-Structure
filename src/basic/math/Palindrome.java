package basic.math;

public class Palindrome {

    public static boolean isNumberPalindrome(int number)
    {
        int originalNumber = number;
        int reverseNumber = 0;
        while (number!=0)
        {
            int remainder = number%10;
            number = number/10;
            reverseNumber = (reverseNumber*10)+ remainder;
        }
        return originalNumber == reverseNumber;
    }
}
