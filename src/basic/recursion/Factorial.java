package basic.recursion;

public class Factorial {
    /**
     * IF number is 4 then factorial is 4*3*2*1
     */
    public static int findFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findFactorial(--number);
    }
}
