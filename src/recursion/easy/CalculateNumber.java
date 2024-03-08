package recursion.easy;

public class CalculateNumber {
    public static int sumNumberN( int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumNumberN( n - 1);
    }
}
