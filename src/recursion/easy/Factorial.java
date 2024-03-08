package recursion.easy;

public class Factorial {

    public static int getFactorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
