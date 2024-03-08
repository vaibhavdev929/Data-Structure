package array.practice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * Find the element that appears more than n/2 times in an array.
     * 3 way to find
     * ===============
     * 1. Brute Force Algorithm
     * 2. Hash Map
     * 3. Moors. Voting Algorithm.
     */


    public static Integer findMajorityElement(int[] array) {
        Map<Integer, Integer> hashMapList = new HashMap<>();
        Integer value = null;
        for (int element : array) {
            hashMapList.put(element, hashMapList.getOrDefault(element, 0) + 1);
            if (hashMapList.getOrDefault(element, 0) > array.length / 2) {
                {
                    value = element;
                    return value;
                }

            }
        }
        return null;
    }

    public static Integer findMajorityElement2(int[] arary) {
        int count = 0;
        int majorityElement = arary[0];
        for (int element : arary) {
            if (count == 0) {
                count=1;
                majorityElement = element;
            }
           else if (majorityElement == element) {
                count++;
            } else {
                count--;
            }

        }
        count = 0;
        for (int element : arary) {
            if (majorityElement == element) {
                count++;
            }
        }
        if (count > arary.length / 2) {
            return majorityElement;
        }
        return null;
    }
}
