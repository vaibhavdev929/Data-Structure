package Utils;

public interface SwipeData {
    static void swipeInteger(int i, int j, int[] arr) {
        int temp=0;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
