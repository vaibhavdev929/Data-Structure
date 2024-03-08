package sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] conquer(int[] array1, int[] array2) {
        int index = 0;
        int i = 0;
        int j = 0;
        int[] combinedArray = new int[array1.length + array2.length];
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combinedArray[index] = array1[i];
                index++;
                i++;
            } else {
                combinedArray[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combinedArray[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combinedArray[index] = array2[j];
            index++;
            j++;
        }
        return combinedArray;
    }

    public static int[] divideList(int[] elements) {
        if (elements.length == 1) {
            return elements;
        }
        int midIndex = elements.length / 2;
        int[] leftList = divideList(Arrays.copyOfRange(elements, 0, midIndex));
        int[] rightList = divideList(Arrays.copyOfRange(elements, midIndex, elements.length));

        return conquer(leftList, rightList);
    }
    public static void sortList(int[] elements)
    {
        int[] sortedList = divideList(elements);
        System.out.print(Arrays.toString(sortedList));
    }
}
