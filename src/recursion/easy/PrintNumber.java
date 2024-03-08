package recursion.easy;

public class PrintNumber {
    public static void print1ToN(int N) {
        if (N == 1) {
            return;
        }
        print1ToN(N - 1);
        System.out.println(N);
    }

    public static void printNTo1(int N) {
        System.out.println(N);
        if (N == 1) {
            return;
        }
        printNTo1(N - 1);

    }


}
