package array.hard;

import java.util.Arrays;

public class MedianTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length+nums2.length];
        int count= 0;

        for (int j : nums1) {
            mergedArray[count] = j;
            count++;
        }
        for (int j : nums2) {
            mergedArray[count] = j;
            count++;
        }
        Arrays.sort(mergedArray);
        int midPos = mergedArray.length/2;
        if(mergedArray.length%2==0){
            return (double) (mergedArray[midPos] + mergedArray[midPos - 1]) /2 ;
        }
        else{
            return mergedArray[midPos];
        }
    }
}
