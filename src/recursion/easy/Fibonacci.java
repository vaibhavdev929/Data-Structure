package recursion.easy;

public class Fibonacci {
    //    0,1,1,2,3,5,8
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
