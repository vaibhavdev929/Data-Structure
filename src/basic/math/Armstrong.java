package basic.math;

public class Armstrong {
    public static boolean isArmstrong(int number)
    {
        int originalNumber = number;
        int sum =0;
        int numberDigit =  String.valueOf(number).length();
        while (number!=0)
        {
            int remainder = number%10;
            sum = (int) (sum + Math.pow(remainder,numberDigit));
            number =  number/10;
        }
        return originalNumber == sum;
    }
}
