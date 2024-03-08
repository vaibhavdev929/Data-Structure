package basic.math;

public class PrimeNumber {
    public static boolean isPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (i != number / 2) {
                    count++;
                }
            }
        }
        return count == 2;
    }
}
