package array.easy;

import java.util.HashMap;

public class ElementsAppearsOnce {

    /**
     * Brute Force Algorithm
     */
    public static int returnAppearsOnce(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int count = 1;
            for (int j = 0; j < elements.length; j++) {
                if (i != j && elements[i] == elements[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return elements[i];
            }
        }
        return -1;
    }

    public static int returnAppearsOnce2(int[] elements) {
        int element = -1;
        int count = 0;
        for (int item : elements) {
            if (element == item) {
                count++;
            }
            if (element == -1) {
                element = item;
                count++;
            }
            if (count == 2) {
                count = 0;
                element = -1;
            }
        }
        return element;
    }

    /**
     *  Using Hash Map
     *  NOTE : but extra space is taking.
     */
    public static int returnAppearsOnce1(int[] elements) {
        HashMap<Integer, Integer> hashMapList = new HashMap<>();
        for (int item : elements) {
            hashMapList.put(item, hashMapList.getOrDefault(item, 0) + 1);
        }
        for (int element : elements) {
            if (hashMapList.get(element) == 1) {
                return element;
            }

        }
        return -1;
    }


}
