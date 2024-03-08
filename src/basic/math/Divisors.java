package basic.math;

public class Divisors {

    public static void findAllDivisors(int number) {

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("======================");
    }

    /**
     * Euclidean Algorithm
     */
    public static void findAllDivisors1(int number) {
        int loopLength = (int) Math.sqrt(number);
        for (int i = 1; i < loopLength; i++) {
            if (number % i == 0) {
                int divisor = number / i;
                System.out.println(i);
                if (divisor != i) {
                    System.out.println(divisor);
                }
            }
        }
        System.out.println("======================");
    }

    public static void findAllDivisors2(int number) {
        for (int i = 1; i * i < number; i++) {
            if (number % i == 0) {
                int divisor = number / i;
                System.out.println(i);
                if (divisor != i) {
                    System.out.println(divisor);
                }
            }
        }
    }
}
