package basic.recursion;

public class Sum {
    public static int sumOfNumber(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumOfNumber(--number);
    }
}
