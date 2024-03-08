package basic.recursion;

public class ReverseArray {
    public static void reverseArray(int start, int end, int[] numbers) {
        if (start > end) {
            for (int number : numbers) {
                System.out.println(number);
            }
            return;
        }
        int temp = numbers[end];
        numbers[end] = numbers[start];
        numbers[start] = temp;
        start++;
        end--;
        reverseArray(start, end, numbers);
    }
}
