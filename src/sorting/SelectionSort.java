package sorting;

import Utils.SwipeData;

/**
 * Selection sort is a simple and efficient sorting algorithm that works by
 * repeatedly selecting the smallest (or largest) element from the unsorted
 * portion of the list and moving it to the sorted portion of the list.
 */
public class SelectionSort {

    public static void sortList(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[min_idx]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                SwipeData.swipeInteger(i, min_idx, elements);
            }
        }

        for (int element : elements) {
            System.out.println(element);
        }
    }

    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[min_index] > elements[j]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                SwipeData.swipeInteger(i, min_index, elements);
            }
        }
        return elements;
    }
}
