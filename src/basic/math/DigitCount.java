package basic.math;

public class DigitCount {

    /**
     * Time Complexity in O(log10(n)) (For division condition we calculate in log)
     *
     */
    public static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static int countDigit2(int number) {
        return (int) Math.log10(number) + 1;
    }
}
