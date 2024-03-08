package sorting;

import Utils.SwipeData;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in the wrong order. This algorithm is not suitable for large data sets
 * as its average and worst-case time complexity is quite high.
 */
public class BubbleSort {
    public static int[] sortList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SwipeData.swipeInteger(j, j + 1, arr);
                }
            }
        }
       /* for (int j : arr) {
            System.out.println(j);
        }*/
        return arr;
    }

    public static int[] sortList1(int[] items) {
        int temp;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length-i-1; j++) {
                if (items[j] > items[j+1]) {
                    temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }
        return items;
    }
}
