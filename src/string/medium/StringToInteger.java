package string.medium;

public class StringToInteger {

    public static int myAtoi(String s) {
        long number = 0;
        int lengt = s.length();
        if (s.isEmpty()) {
            return (int)number;
        }
        boolean isNegative = false;
        int index =0;
        while(index< lengt && s.charAt(index)==' ')
        {
            index++;
        }
        if(s.charAt(index)=='-')
        {
            isNegative =  true;
            index++;
        }else if(s.charAt(index)== '+')
        {
            index++;
        }
        while(index< lengt && isDigit(s.charAt(index)))
        {
            int digit =s.charAt(index)-'0';
            number = (number * 10) + digit;
            index++;
        }

        if (isNegative) {
            number = number * -1;
        }

        if(number>Integer.MAX_VALUE  )
        {
            return Integer.MAX_VALUE ;
        }else if(number<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }

        return (int) number;
    }

    private static boolean isDigit(char ch)
    {
        return ch >= '0' && ch <='9';
    }
}
