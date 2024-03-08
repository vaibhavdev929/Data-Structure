package basic.recursion;

public class Print {

    public static void printNameNTime(int N) {
        if (N == 0) {
            return;
        }
        System.out.println("Name");
        N--;
        printNameNTime(N);
    }

    public static void printNumberNTime(int number) {
        if (number == 0) {
            return;
        }

        number--;
        printNumberNTime(number);
        System.out.println(number);
    }

    public static void printOneToN(int i, int N) {
        if (i > N) {
            return;
        }
        System.out.println(i);
        printOneToN(i + 1, N);
    }

    public static void printNumberInReverse(int number) {
        if (number == 0) {
            return;
        }
        System.out.println(number);
        number--;
        printNumberInReverse(number);
    }
}
