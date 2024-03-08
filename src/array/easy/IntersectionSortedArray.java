package array.easy;

import java.util.*;

public class IntersectionSortedArray {
    public static List<Integer> findCommonElements1(int[] array1, int[] array2) {
        List<Integer> combinedList = new ArrayList<>();
        for (int item1 : array1) {
            for (int item2 : array2) {
                if (item1 == item2) {
                    if (!combinedList.contains(item1)) {
                        combinedList.add(item1);
                    }
                    break;
                }
            }
        }

        return combinedList;
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElements = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();

        // Add elements from the first array to the set
        for (int element : array1) {
            set1.add(element);
        }

        // Check for common elements in the second array
        for (int element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }

    public static List<Integer> findCommonElements3(int[] array1, int[] array2) {
        List<Integer> commonElements = new ArrayList<>();

        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0; // Index for array1
        int j = 0; // Index for array2

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                commonElements.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return commonElements;
    }

    public static List<Integer> findCommonElements4(int[] array1, int[] array2) {
        List<Integer> commonElements = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of elements in the first array
        for (int element : array1) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Check for common elements in the second array
        for (int element : array2) {
            if (frequencyMap.containsKey(element) && frequencyMap.get(element) > 0) {
                commonElements.add(element);
                frequencyMap.put(element, frequencyMap.get(element) - 1);
            }
        }

        return commonElements;
    }

    //=============  Practice =================

    public static List<Integer> intersection(int[] array1, int[] array2) {
        List<Integer> combinedList = new ArrayList<>();
        for (int item1 : array1) {
            for (int item2 : array2) {
                if (item1 == item2) {
                    if (!combinedList.contains(item1)) {
                        combinedList.add(item1);
                    }
                    break;
                }
            }
        }
        return combinedList;
    }


}
