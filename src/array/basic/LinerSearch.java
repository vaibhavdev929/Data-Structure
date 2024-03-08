package array.basic;

public class LinerSearch {
    public int findElementPosition(int[] items, int element) {
        if (items.length < 1) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        int position = -1;
        for (int i = 0; i < items.length; i++) {
            if (element == items[i]) {
                position = i;
                break;
            }
        }
        return position;
    }
}
