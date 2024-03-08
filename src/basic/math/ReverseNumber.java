package basic.math;

public class ReverseNumber {
    public static int reverseNumber(int number)
    {
        int reverseNumber=0;
        while (number!=0)
        {
            int remainder = number%10;
            number = number/10;
            reverseNumber = (reverseNumber*10)+remainder;
        }
        return reverseNumber;
    }
}
