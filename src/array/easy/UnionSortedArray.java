package array.easy;

import java.util.HashSet;
import java.util.Set;

public class UnionSortedArray {

    /**
     * Two pointer Algorithm
     */
    public static int[] getUnionList(int[] number1, int[] number2)
    {
        return number1;
    }
    public static Set<Integer> findArrayUnionWithoutDuplicates(int[] array1, int[] array2) {

        Set<Integer> unionSet = new HashSet<>();

        // Add elements from array1 to the union, removing duplicates
        for (int element : array1) {
            unionSet.add(element);
        }

        // Add elements from array2 that are not already in the union, removing duplicates
        for (int element : array2) {
            unionSet.add(element);
        }

        return unionSet;
    }
}
