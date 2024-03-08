package sorting;

import Utils.SwipeData;

/**
 * Insertion sort is a simple sorting algorithm that works similar to
 * the way you sort playing cards in your hands. The array is virtually split
 * into a sorted and an unsorted part. Values from the unsorted part are picked
 * and placed at the correct position in the sorted part.
 */
public class InsertionSort {
    public static void sortList(int[] elements) {

        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            int j = i - 1;
            while (j >= 0 && key < elements[j]) {
                elements[j+1] = elements[j];
                j--;
            }
            elements[j+1] =key;
        }

        for (int element : elements) {
            System.out.print(element);
        }
    }
}
