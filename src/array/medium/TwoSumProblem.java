package array.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    /**
     * Brute Force Solution
     */
    public static int[] findTheTargetSumIndex(int[] elements, int targetElements) {
        int[] targetIndex = new int[2];
        for (int i = 0; i < elements.length - 1; i++) {
            int temp = elements[i];
            for (int j = i + 1; j < elements.length; j++) {
                if ((temp + elements[j]) == targetElements) {
                    targetIndex[0] = i;
                    targetIndex[1] = j;
                    break;
                }
            }
        }
        return targetIndex;
    }

    /**
     * Hashing
     */
    public static int[] findTheTargetSumIndex1(int[] elements, int targetElements) {
        int[] targetIndex = new int[2];
        Map<Integer, Integer> hashMapItems = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            int more = targetElements - elements[i];
            if (hashMapItems.containsKey(more)) {
                targetIndex[0] = hashMapItems.get(more);
                targetIndex[1] = i;
                break;
            } else {
                hashMapItems.put(elements[i], i);
            }

        }
        return targetIndex;
    }

    /**
     * Two Pointer Algorithm
     */
    public static int[] findTheTargetSumIndex2(int[] elements, int targetElements) {
        int[] targetIndex = new int[2];

        return targetIndex;
    }


}
