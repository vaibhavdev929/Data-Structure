package search.binary;


public class BinarySearch1dArray {

    /**
     * ============= 1. Search Item ===================
     */
    public static int searchItem(int[] items, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int midElement = (low + high) / 2;
        if (items[midElement] == key) {
            return midElement;
        } else if (key > items[midElement]) {
            return searchItem(items, key, midElement + 1, high);
        } else {
            return searchItem(items, key, low, midElement - 1);
        }
    }

    /**
     * ============= 2. Lower Bound ===================
     * items[index] >= key
     */
    public static int findLowerBoundIndex(int[] items, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int midElement = (low + high) / 2;
        return midElement;
    }

    /**
     * ============= 3. Upper Bound ===================
     * items[index] > key
     */
    public static int findUpperBoundIndex(int[] items, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int midElement = (low + high) / 2;
        return midElement;
    }

    /**
     * ============= 3. Floor ===================
     * Largest number in array <= key
     */
    public static int findFloorIndex(int[] items, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int midElement = (low + high) / 2;
        return midElement;
    }

   /**
     * ============= 4. Ceil ===================
     * smallest number in array >= key
     */
    public static int findCeilIndex(int[] items, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int midElement = (low + high) / 2;
        return midElement;
    }

   /**
     * ============= 5. Find first last occurrence ===================
     * smallest number in array >= key
     */
    public static void findFirstLastOccurrence(int[] items, int key, int low, int high) {
        if (low > high) {

        }

    }

   /**
     * ============= 6. Count occurrence ===================
     * smallest number in array >= key
     */
    public static void CountOccurrence(int[] items, int key, int low, int high) {
        if (low > high) {

        }

    }

   /**
     * ============= 7. Search Rotated Array in Sorted ===================
     */
    public static void SearchRotedArraySorted(int[] items, int key, int low, int high) {
        if (low > high) {

        }
    }

   /**
     * ============= 8. Search Rotated Array Unsorted ===================
     */
    public static void SearchRotedArrayUnsorted(int[] items, int key, int low, int high) {
        if (low > high) {

        }
    }

   /**
     * ============= 9. Find minimum element in rotated array =============
     */
    public static void findMinimumRotatedArray(int[] items, int key, int low, int high) {
        if (low > high) {

        }
    }
   /**
     * ============= 10. Find number of rotation in sorted array =============
     */
    public static void findNumberOfRotation(int[] items, int key, int low, int high) {
        if (low > high) {

        }
    }

}

