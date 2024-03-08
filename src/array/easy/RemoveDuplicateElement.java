package array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove Duplicate element from sorted array
 */
public class RemoveDuplicateElement {

    /**
     * Brute Force Algorithm
     */
    public static int[] removeDuplicateElement(int[] array) {
        Set<Integer> newList = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            newList.add(array[0]);
        }
        return newList.stream().mapToInt(Integer::intValue).toArray();
    }


    /**
     * {1,2,2,3,4,4,5}
     * Two Pointer Algorithm.
     */
    public static int[] removeDuplicateElement1(int[] array) {
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[i] != array[j]) {
                i++;
                array[i] = array[j];
            }
        }
        for (int j = i+1; j < array.length; j++) {
            array[j] = 0;
        }

        return array;
    }

}
