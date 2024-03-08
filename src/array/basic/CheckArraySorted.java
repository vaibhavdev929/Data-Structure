package array.basic;

public class CheckArraySorted {
    public static boolean isArraySorted(int[] numbers) {
        boolean isShorted = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isShorted = false;
                break;
            }
        }
        return isShorted;
    }
}
