package array.easy;

public class MergeSortedArray {
    public static int[] mergeTwoArray(int[] n1, int[] n2) {
        int length1 = n1.length;
        int length2 = n2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[length1 + length2];
        while (i < length1 && j < length2) {
            if (n1[i] > n2[j]) {
                mergedArray[k] = n2[j++];
            } else {
                mergedArray[k] = n1[i++];
            }
            k++;
        }
        while (i < length1) {
            mergedArray[k++] = n1[i++];
        }

        while (j < length2) {
            mergedArray[k++] = n2[j++];
        }

        return mergedArray;
    }
}
